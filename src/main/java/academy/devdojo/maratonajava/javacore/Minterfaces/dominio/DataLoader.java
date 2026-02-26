package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermisssion(){
        System.out.println("Checando permissões...");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize() da interface DataLoader");
    }
}
