package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("texto.txt");
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) { // O BufferedWriter encapsula a FileWritter. E também a otimiza.
            bw.write("Você, eu, ninguém vai bater tão duro como a vida. Mas não se trata de bater duro. Se trata de quanto você aguenta apanhar e seguir em frente. O quanto você é capaz de aguentar e continuar tentando. É assim que se consegue vencer...");
            bw.newLine(); // Faz quebra de linha. Não recomendável utilizar \n, pois nem todos os SO o utilizam.
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
