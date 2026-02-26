package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // MetaCaracteres:
        // \d = Todos os dígitos
        // \D = NÃO Todos os dígitos
        // \s = espaços em branco \t \n \f \r
        // \S = NÃO espaços em branco \t \n \f \r
        // \w = a-zA-Z, digitos, _
        // \W = NÃO a-zA-Z, digitos, _
        String regex = "\\W";
        String txt1 = "abbbbabb";
        String txt2 = "abababa";
        String txt3 = "z@#xz1$21%yx& y* z-xx";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(txt1);
        Matcher matcher2 = pattern.matcher(txt2);
        Matcher matcher3 = pattern.matcher(txt3);

        System.out.println("txt:    " + txt3);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher3.find()){ // Verifica se ainda há match
            System.out.println(matcher3.start() + " " + matcher3.group()); // .start() retorna o índice da 1ª ocorrência, .group() retorna o regex
        }

        // Obs: se der match e ainda houver matches, ele começa a partir do próimo indice
    }
}
