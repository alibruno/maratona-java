package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio1.test;

import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio1.dominio.AnaliseDeTransacao;
import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio1.dominio.Categoria;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

public class AnaliseDeTransacaoTest01 {
    public static void main(String[] args) {
        AnaliseDeTransacao analiseDeTransacao = new AnaliseDeTransacao();
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

        System.out.println("Lendo .csv");
        analiseDeTransacao.lerCSV();
        System.out.println("--------------------------------------");

        System.out.println("calcularTotalPorCategoria()");
        Map<Categoria, BigDecimal> categoriaBigDecimalMap = analiseDeTransacao.calcularTotalPorCategoria();
        for (Map.Entry<Categoria, BigDecimal> entry : categoriaBigDecimalMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + numberFormat.format(entry.getValue()));
        }

        System.out.println("--------------------------------------");

        System.out.println("contarTransacoesPorDescricao()");
        Map<String, Long> stringLongMap = analiseDeTransacao.contarTransacoesPorDescricao();
        for (Map.Entry<String, Long> entry : stringLongMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
