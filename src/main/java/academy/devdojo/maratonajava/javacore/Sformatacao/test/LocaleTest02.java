package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        StringBuilder sbIC = new StringBuilder(isoCountries.length);
        for (String isoCountry : isoCountries) {
            // sb.append(isoCountry + " "); -> O StringBuilder criará uma String temporária para resolver
            // a concatenação (isoCountry + " "). Quando anexada no sbIC, será coletada pelo garbage collector
            // Conseq: Maior consumo de memória

            sbIC.append(isoCountry).append(" "); // Nesse caso, não é criada uma String temporária
        }

        StringBuilder sbIL = new StringBuilder(isoLanguages.length);
        for (String isoLanguage : isoLanguages) {
            sbIL.append(isoLanguage).append(" ");
        }

        System.out.println(sbIC);
        System.out.println(sbIL);

    }
}
