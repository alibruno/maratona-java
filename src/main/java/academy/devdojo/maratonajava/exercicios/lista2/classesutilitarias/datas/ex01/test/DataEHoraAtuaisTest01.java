package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.datas.ex01.test;

// Crie um programa simples que utilize a API java.time para obter e exibir a data
// e a hora atuais. Use a classe LocalDateTime e seu metodo now().

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataEHoraAtuaisTest01 {
    public static void main(String[] args) {
        Locale brazil = Locale.of("pt", "BR");

        System.out.println("Classe Date e SimpleDateFormat");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss", brazil);
        System.out.println(sdf.format(date));
        System.out.println("--------------------------------------------------");

        System.out.println("Classe Calendar e DateFormat");
        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, brazil);
        System.out.println(df.format(c.getTime()));
        System.out.println("--------------------------------------------------");

        System.out.println("Classe LocalDateTime e DateTimeFormatter");
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss", brazil);
        String formatBR = localDateTime.format(formatterBR);
        System.out.println(formatBR);
    }
}
