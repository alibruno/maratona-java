package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.strings.ex01.test;

// Peça ao usuário para digitar seu nome e sobrenome separadamente. Utilize os
// métodos da classe String para:
//      1. Concatenar o nome e o sobrenome para formar o nome completo.
//      2. Converter o nome completo para letras maiúsculas.
//      3. Verificar se o nome completo contém o sobrenome "Silva" (ignorando
//      maiúsculas/minúsculas).
//Imprima os resultados de cada operação.

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Philippe";
        String sobrenome = " Coutinho Silva";
        String nomeCompleto = nome.concat(sobrenome);
        System.out.println("Nome completo: " + nomeCompleto);
        String nomeCompletoToUpperCase = nomeCompleto.toUpperCase();
        System.out.println("Nome completo em caixa alta: " + nomeCompletoToUpperCase);
        temSobrenomeSilva(nomeCompleto);
    }

    public static void temSobrenomeSilva(String nomeCompleto) {
        String[] s = nomeCompleto.split(" ");
        for (String nomeProprio : s) {
            if (nomeProprio.equalsIgnoreCase("Silva")) {
                System.out.println("Tem sobrenome \"Silva\" ");
                return;
            }
        }
        System.out.println("Não tem sobrenome \"Silva\" ");
    }

}


