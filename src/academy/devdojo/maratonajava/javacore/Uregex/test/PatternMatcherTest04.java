package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        String regex = "0[bB][01]+(\\s|$)";
        String txt4 = "3A7 asfdjv#$T2 0b101 0bIOP 0B11012 0b11";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txt4);

        System.out.println("txt:    " + txt4);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){ // Verifica se ainda há match
            System.out.println(matcher.start() + " " + matcher.group()); // .start() retorna o índice da 1ª ocorrência, .group() retorna o regex
        }

        // Obs: se der match e ainda houver matches, ele começa a partir do próimo indice

//        int numBinario = 0b1010;
//        System.out.println(numBinario);
    }
}
