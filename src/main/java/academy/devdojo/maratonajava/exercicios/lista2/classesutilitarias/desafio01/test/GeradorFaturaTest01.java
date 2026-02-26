package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.desafio01.test;

// Desenvolva um programa que gera uma fatura de texto simples. A característica
// principal é que a fatura deve ser internacionalizada. O usuário deve especificar
// o locale por meio do scanner, seguindo o padrão "language_country".
// por exemplo: pt_BR ou en_US.
//
//Com base no locale fornecido, o programa deve gerar uma fatura que contenha:
//    1. Um título ("Fatura" ou "Invoice"). Este texto deve vir de um ResourceBundle.
//    2. A data de emissão da fatura, formatada de acordo com as convenções do locale
//    (ex: "27/10/2023" para pt_BR, "10/27/23" para en_US). Use
//    DateTimeFormatter.ofLocalizedDate().
//    3. Uma lista de 2-3 itens com preços. Os preços devem ser formatados como moeda
//    local, com o símbolo e separadores corretos (ex: "R$ 1.250,50" vs "$1,250.50").
//    Use NumberFormat.getCurrencyInstance().
//    4. Uma mensagem de agradecimento no rodapé ("Obrigado pela sua compra!" ou "Thank
//    you for your purchase!"), também vinda do ResourceBundle.
//
// Este desafio demonstra como as diferentes facetas da internacionalização (texto,
// datas e moedas) se unem, todas governadas por um único objeto Locale, para criar uma
// aplicação verdadeiramente global.

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GeradorFaturaTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua localização (pt_BR ou en_US):");
        String localizacao = scanner.next();
        while (!localizacao.equals("pt_BR") && !localizacao.equals("en_US")) {
            System.out.println("Localizacao Inválida. Tente novamente.");
            System.out.println("Insira sua localização (pt_BR ou en_US):");
            localizacao = scanner.next();
        }
        String[] localeUser = localizacao.split("_");
        Locale locale = Locale.of(localeUser[0], localeUser[1]);
        ResourceBundle bundle = ResourceBundle.getBundle("geradorfatura", locale);
        NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
        DateTimeFormatter formatterDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);
        LocalDateTime now = LocalDateTime.now();

        System.out.println(bundle.getString("invoice") + " (" + now.format(formatterDate) + "):");
        System.out.println("Hotel: " + currency.format(200));
        System.out.println("Chocolate: " + currency.format(10));
        System.out.println("Pizza: " + currency.format(30));
        System.out.println(bundle.getString("thanks.purchase"));
    }
}
