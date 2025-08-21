package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.regex.ex03.test;

// Dada a seguinte String: "Nome: João, Idade: 30, Cidade: São Paulo". Use as classes Pattern e
// Matcher para criar uma regex que consiga extrair os valores associados a "Nome", "Idade" e
// "Cidade". Utilize grupos de captura () na sua regex para isolar esses valores. Itere sobre os
// resultados encontrados pelo Matcher e imprima cada chave e valor extraído.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtracaoDeDadosTest01 {
    public static void main(String[] args) {
        String regex = "((\\w+\\s*)+(,|$))";
        String test = "Nome: Joao, Idade: 30, Cidade: Sao Paulo";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        StringBuilder sb = new StringBuilder(3);
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        String[] valoresExtraidos = sb.toString().split(",");

        for (String valorExtraido : valoresExtraidos) {
            System.out.println(valorExtraido);
        }
    }
}
