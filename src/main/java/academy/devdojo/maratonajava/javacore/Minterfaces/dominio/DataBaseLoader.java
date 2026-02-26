package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do bd...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do bd...");
    }

    @Override
    public void checkPermisssion() {
        System.out.println("Checando permissões no bd...");
    }

//    @Override
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize() da classe DataBaseLoader");
    }

    // retrieveMaxDataSize() from DataBaseLoader != retrieveMaxDataSize() from DataLoader
}
