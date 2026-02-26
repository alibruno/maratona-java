package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.datas.ex02.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// Peça ao usuário para digitar sua data de nascimento no formato "dd/MM/yyyy".
// Use um DateTimeFormatter para definir esse padrão e, em seguida, use
// LocalDate.parse() para converter a String do usuário em um objeto LocalDate. Por
// fim, use a classe Period para calcular a diferença entre a data de nascimento e
// a data atual (LocalDate.now()) e exiba a idade da pessoa em anos.
public class CalculandoIdadeTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua data de nascimento no formato: dd/MM/yyyy");
        String dataDeNasc = scanner.next();
        LocalDate parseDataDeNasc = LocalDate.parse(dataDeNasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(parseDataDeNasc.until(LocalDate.now(), ChronoUnit.YEARS));
        Period diferencaDeTempo = Period.between(parseDataDeNasc, LocalDate.now());
        System.out.println(diferencaDeTempo.getYears());
    }
}
