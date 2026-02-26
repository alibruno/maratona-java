package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio02.test;

import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio02.dominio.FormatoDeLinhaInvalidoException;

import java.io.*;

public class ProcessadorDeArquivoTest01 {
    public static void main(String[] args) {
        File fileDados = new File("arquivos_exercicios\\lista02\\exception_desafio02", "dados.txt");
        File fileErrosLog = new File("arquivos_exercicios\\lista02\\exception_desafio02", "erros.log");
        int somaIdades = 0;
        try (FileReader fr = new FileReader(fileDados); BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(fileErrosLog); BufferedWriter bw = new BufferedWriter(fw)) {
            String linha;
            int iteracao = 1;
            while ((linha = br.readLine()) != null) {
                try {
                    somaIdades += idadeContidaNaLinha(linha, iteracao);
                } catch (FormatoDeLinhaInvalidoException e) {
                    bw.write(e.getMessage());
                    bw.newLine();
                }
                iteracao++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Soma das idades: " + somaIdades);
    }

    public static int idadeContidaNaLinha(String linha, int iteracao) {
        String[] linhaSplit = linha.split(",");
        try {
            return Integer.parseInt(linhaSplit[1]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            throw new FormatoDeLinhaInvalidoException("Erro na linha " + iteracao + ": [" + linha + "]");
        }
    }
}