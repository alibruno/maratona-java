package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResoursesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        // Só funciona quando é necessário implementar Closable ou AutoClosable;
        // Já faz o tratamento da exceção do Closable;
        // É fechado na ordem inversa;
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        // Exceção do FileReader
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        // É necessário fechar a leitura do arquivo (Reader implements ..., *Closable*)
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            // Exceção do Closable
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
