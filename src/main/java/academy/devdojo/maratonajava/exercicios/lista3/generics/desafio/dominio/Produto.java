package academy.devdojo.maratonajava.exercicios.lista3.generics.desafio.dominio;

import java.util.Objects;

public class Produto implements Entidade<String> {
    private String codigo;
    private String descricao;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public String getId() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
