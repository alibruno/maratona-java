package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.datas.ex03.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// Desenvolva um programa que exiba a data e a hora exatas atuais em três fusos
// horários diferentes:
//      1. O fuso horário padrão da máquina onde o programa está rodando.
//      2. O fuso horário de Tóquio (ID: "Asia/Tokyo").
//      3. O fuso horário de Nova York (ID: "America/New_York").
//Utilize a classe ZonedDateTime para realizar essa tarefa.
public class FusosHorariosTest01 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        ZonedDateTime zonedDefault = agora.atZone(ZoneId.systemDefault());
        ZonedDateTime zonedTokyo = agora.atZone(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime zonedNY = agora.atZone(ZoneId.of("America/New_York"));
        System.out.println(zonedDefault);
        System.out.println(zonedTokyo);
        System.out.println(zonedNY);
    }
}
