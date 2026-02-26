package academy.devdojo.maratonajava.javacore.Zgenerics.service;


import java.util.List;

public class RentavelService<T> { // Classe genérica
    // "O foco principal dos generics é a reutilização de algoritmos e estruturas de dados para diferentes tipos, sem a necessidade de conversões explícitas (casts) e
    //  com a vantagem de detectar erros de tipo durante o desenvolvimento."
    private List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto disponível.....");
        T t = objetosDisponiveis.removeFirst();
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
