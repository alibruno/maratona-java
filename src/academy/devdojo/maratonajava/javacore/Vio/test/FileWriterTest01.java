package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("texto.txt");
        try (FileWriter fw = new FileWriter(file, true)) { // TryWithResourses; É recomendável fechar quando se utiliza recursos do SO. 2º Parâmetro: append. Caso não seja declarado, o texto será sobrescrito
            fw.write("Você, eu, ninguém vai bater tão duro como a vida. Mas não se trata de bater duro. Se trata de quanto você aguenta apanhar e seguir em frente. O quanto você é capaz de aguentar e continuar tentando. É assim que se consegue vencer...\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
