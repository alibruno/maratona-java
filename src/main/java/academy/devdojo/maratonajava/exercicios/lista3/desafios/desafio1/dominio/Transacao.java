package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio1.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {
    private LocalDate data;
    private String descricao;
    private BigDecimal valor;
    private Categoria categoria;

    public Transacao(LocalDate data, String descricao, BigDecimal valor, Categoria categoria) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "data=" + data +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", categoria=" + categoria +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
