package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isArquivoDiretorioCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isArquivoDiretorioCreated);
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isArquivoDiretorioRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isArquivoDiretorioRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
