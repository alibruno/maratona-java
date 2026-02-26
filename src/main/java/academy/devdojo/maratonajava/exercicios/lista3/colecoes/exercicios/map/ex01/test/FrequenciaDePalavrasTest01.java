package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.map.ex01.test;

//    Descrição: Escreva um programa que leia um texto (pode ser uma string longa e fixa no código)
//    e conte a frequência de cada palavra. Use um HashMap<String, Integer> para armazenar as palavras
//    como chaves e suas contagens como valores. O programa deve ignorar diferenças entre maiúsculas
//    e minúsculas e remover pontuações básicas antes de contar.
//
//    Objetivo: Implementar um dos casos de uso mais clássicos para Map, praticando a lógica de verificar
//    a existência de uma chave antes de inserir ou atualizar seu valor.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenciaDePalavrasTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um texto:");
        String texto = scanner.nextLine();

        String[] palavras = texto.trim().toUpperCase().replaceAll("[.,;:?!()-]", "").split("\\s");
        Map<String, Integer> contador = new HashMap<>();

        for (String palavra : palavras) {
            if (contador.containsKey(palavra)) {
                contador.put(palavra, (contador.get(palavra) + 1));
                continue;
            }
            contador.put(palavra, 1);
        }

        System.out.println("Contagem de cada palavra:");
        for (Map.Entry<String, Integer> stringIntegerEntry : contador.entrySet()) {
            System.out.println(stringIntegerEntry);
        }
    }
}
