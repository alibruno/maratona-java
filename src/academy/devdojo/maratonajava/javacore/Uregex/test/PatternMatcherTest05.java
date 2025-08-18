package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // MetaCaracteres:
        // \d = Todos os dígitos
        // \D = NÃO Todos os dígitos
        // \s = espaços em branco \t \n \f \r
        // \S = NÃO espaços em branco \t \n \f \r
        // \w = a-zA-Z, digitos, _
        // \W = NÃO a-zA-Z, digitos, _
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | (Ex: o(v|c) ovo | oco)
        // $
        // . 1.3 123, 1A3, 1)3...

//        String regex = "\\w+@\\w+.\\w+";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String txt = "99poro@yahoo.com, graves@outlook.com.br, leclerc@gmail.com, @#$%twitch@gmail.rs, olong@mail";

        System.out.println("Email é válido?");
        System.out.println("99poro@yahoo.com".matches(regex));
        System.out.println("@#$%twitch@gmail.rs".matches(regex));
        System.out.println(Arrays.toString(txt.split(","))); // Quebra a string por ","
        System.out.println(txt.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt);

        System.out.println("txt:    " + txt);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){ // Verifica se ainda há match
            System.out.println(matcher.start() + " " + matcher.group()); // .start() retorna o índice da 1ª ocorrência, .group() retorna o regex
        }

        // Obs: se der match e ainda houver matches, ele começa a partir do próximo indice

//        int numBinario = 0b1010;
//        System.out.println(numBinario);
    }
}
