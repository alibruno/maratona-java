package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        // Obs: leia a documentação da Oracle do SimpleDateFormat
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss"; // aspas simples -> ignorar quando executado
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("Brasil 05 de janeiro de 1551 às 12:45:16")); // retorno: Date; Se não seguir a mesma config da máscara, lançará uma execeção.
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
