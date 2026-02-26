package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.datas.ex04.test;

// Escreva um programa que declare uma variável double com um valor monetário, por exemplo,
// 123456.78. Utilize a classe NumberFormat para formatar e exibir este valor como moeda para
// três localidades (Locale) diferentes:
//      Brasil (new Locale("pt", "BR"))
//      Estados Unidos (Locale.US)
//      Alemanha (Locale.GERMANY)
//A saída deve mostrar o símbolo da moeda correto e a formatação de números apropriada para
// cada país (ex: "R$ 123.456,78", "$123,456.78", "123.456,78 €").
import java.text.NumberFormat;
import java.util.Locale;

public class FormatacaoDeMoedaTest01 {
    public static void main(String[] args) {
        NumberFormat formatMoedaBR = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        NumberFormat formatMoedaUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatMoedaGE = NumberFormat.getCurrencyInstance(Locale.GERMANY);

        double valor = 123_456.78;
        System.out.println(formatMoedaBR.format(valor));
        System.out.println(formatMoedaUS.format(valor));
        System.out.println(formatMoedaGE.format(valor));
    }
}
