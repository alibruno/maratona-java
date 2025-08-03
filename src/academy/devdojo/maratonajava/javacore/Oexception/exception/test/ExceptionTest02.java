package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    // Na assinatura de um metodo, se tiver 'throws TipoException', avisa que a exceção pode ser lançada e
    // obriga (caso seja Checked) seu tratamento a quem chamou (ex: main (caso não tivesse throws IOException) - linha 8)
    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\texto.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
