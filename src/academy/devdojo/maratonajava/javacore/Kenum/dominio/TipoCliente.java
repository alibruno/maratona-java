package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    // Quando inicializo o Enum, o determinado atributo com seus respectivos parâmetros inicilizalizará o construtor.
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private int valor;
    private String nome;

    private TipoCliente(int valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }

    public static TipoCliente tipoClientePorNome(String nome){
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNome().equals(nome)){
                return tipoCliente;
            }
        }
        return null;
    }
    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
