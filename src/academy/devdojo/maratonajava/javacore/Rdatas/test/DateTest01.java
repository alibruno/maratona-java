package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // Classe obsoleta
        Date date = new Date(1754660492568L); // long
        // date.getTime(); retorna o long da data atual (Construtor do date vazio)
        System.out.println(date);
        // Problema: internacionalização
    }
}
