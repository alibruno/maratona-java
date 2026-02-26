package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeUK = Locale.UK;
        Locale localeJP = Locale.JAPAN;
        Locale localePTBR = new Locale("pt", "BR");
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeUK);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localePTBR);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
//            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "£10,000.21";
        // Essa string poderá causar muitos problemas pois cada moeda possui uma simbologia que a representa.
        // Caso não seja explicita na string, causará uma execeção.

        try {
            System.out.println("Formatação para número: " + nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
