package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // Ordem de inicialização ao instanciar o objeto -> Bloco de inicialização estático > Alocar endereço de Memória > Atributos >
    //                                                  Bloco de inicialização > Construtores > Métodos

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(){
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
