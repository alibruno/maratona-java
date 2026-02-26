package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio1.dominio;

public enum Categoria {
    // Documentação do Java:
    // "In Java, all enums implicitly extend java.lang.Enum, which itself implements the Comparable interface. This means
    // that enum constants have a natural ordering based on their declaration order within the enum. "

    ALIMENTAÇÃO("ALIMENTAÇÃO"),
    ASSINATURAS("ASSINATURAS"),
    COMPRAS("COMPRAS"),
    LAZER("LAZER"),
    MORADIA("MORADIA"),
    RECEITA("RECEITA"),
    SAÚDE("SAÚDE"),
    TRANSFERÊNCIAS("TRANSFERÊNCIAS"),
    TRANSPORTE("TRANSPORTE");

    String nome;

    Categoria(String nome) {
        this.nome = nome;
    }

    public static Categoria categoriaPorString(String nome) {
        for (Categoria categoria : values()) {
            if (categoria.getNome().equalsIgnoreCase(nome)) {
                return categoria;
            }
        }
        throw new CategoriaInvalidaException("Categoria inválida. Categorias diponíveis:\n" + categoriasDisponiveis());
    }

    public static String categoriasDisponiveis() {
        StringBuilder sb = new StringBuilder();
        for (Categoria categoria : values()) {
            sb.append(categoria).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }
}
