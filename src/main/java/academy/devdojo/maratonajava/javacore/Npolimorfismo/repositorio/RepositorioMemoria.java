package academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio;

public class RepositorioMemoria implements Repositorio{

    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
