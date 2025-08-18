package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeUK = Locale.UK;
        Locale localeJP = Locale.JAPAN;
        Locale localePTBR = new Locale("pt", "BR");
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localeUK);
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localePTBR);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa) {
//            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1000.2130";
        // Se tiver um caracter inválido como '_', o parse converterá até sua aparição no número, desconsiderando
        // o restante dos caracteres. Caso o primeiro digito seja inválido, será lançada uma execeção.

        try {
            System.out.println("Conversão para número: " + nfa[0].parse(valorString));
            System.out.println("Formatação desse número (nfa[0]): " + nfa[0].format(nfa[0].parse(valorString)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
