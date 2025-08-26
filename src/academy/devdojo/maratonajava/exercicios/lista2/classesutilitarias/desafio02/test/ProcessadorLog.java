package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.desafio02.test;

// Você recebeu um arquivo de log (log.txt) onde cada linha segue um padrão estrito:
// AAAA-MM-DDTHH:MM:SS [NÍVEL] Mensagem de log.
// Exemplos de linhas no arquivo:
// 2025-08-23T17:05:15  [INFO] Usuário 'admin' logado com sucesso.
// 2025-08-24T12:30:12  [FATAL] Falha ao conectar ao banco de dados.
// 2025-01-29T09:31:04  [ERROR] Tentativa de login falhou para o usuário 'guest'.
//
// Crie um programa que realize uma análise neste arquivo. Ele deve:
//    1. Ler o arquivo linha por linha (usando Scanner com um File ou
//    Files.newBufferedReader).
//    2. Para cada linha, usar uma Expressão Regular com grupos de captura (Pattern
//    e Matcher) para extrair a data/hora, o nível do log (INFO, ERROR, etc.) e a
//    mensagem.
//    3. Converter a String de data/hora extraída para um objeto LocalDateTime (usando
//    LocalDateTime.parse()).
//    4. Implementar uma lógica de filtro: o programa deve imprimir no console apenas
//    as mensagens de log que são do nível "ERROR" e que ocorreram nas últimas 24 horas
//    a partir do momento da execução do programa.
// Este desafio força a integração de múltiplas classes utilitárias para resolver um
// problema de processamento de dados do mundo real: Scanner para a leitura, Regex
// para extração estruturada e java.time para a lógica de filtro temporal.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProcessadorLog {
    public static void main(String[] args) {
        File fileLog = new File("arquivos_exercicios\\lista02\\classesutilitarias_desafio02", "log.txt");
        // Padrão: AAAA-MM-DDTHH:MM:SS [NÍVEL] Mensagem de log.
        String regexDataEHora = "\\d{4}(-\\d{2}){2}T\\d{2}(:\\d{2}){2}";
        String regexNivel = "\\[[a-zA-Z]+\\]";
        String regexMensagem = "[^\\]\\s](\\w|\\s)+.$";
        Pattern patternNivel = Pattern.compile(regexNivel);
        Pattern patternDataEHora = Pattern.compile(regexDataEHora);
        try (BufferedReader br = new BufferedReader(new FileReader(fileLog))) {
            String linha;
            Matcher matcherNivel;
            Matcher matcherDataEHora;
            LocalDateTime now = LocalDateTime.now();
            while ((linha = br.readLine()) != null) {
                matcherNivel = patternNivel.matcher(linha);
                if (!matcherNivel.find()) {
                    continue;
                }
                if (!matcherNivel.group().equals("[ERROR]")) {
                    continue;
                }
                matcherDataEHora = patternDataEHora.matcher(linha);
                if (!matcherDataEHora.find()) {
                    continue;
                }
                if (ChronoUnit.HOURS.between(LocalDateTime.parse(matcherDataEHora.group()), now) > 24) {
                    continue;
                }
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
