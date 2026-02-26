package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Francisco", "20250101");
        Turma turma = new Turma("Java");
        aluno.setTurma(turma);
        serializar(aluno);
        desserializar();
    }

    // Serializar: Guardar estado do objeto num array de bytes, que podem ser salvos, por exemplo, em arquivos. -> Baixo nível
    // Nota: É necessário implemetar, no objeto que será serializado, a interface "Serializable"(É um objeto serializável).

    // Guardar/Compactar > Conteúdo de um objeto -> File
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta2/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Ler/Descompactar > Conteúdo de um objeto <- File
    private static void desserializar(){
        Path path = Paths.get("pasta2/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
