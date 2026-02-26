package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.wrappers.ex02.test;

// Crie um array de objetos Integer (Integer). Adicione alguns números a este array.
// Note que ao fazer meuArray = 5;, o Java está convertendo automaticamente o
// primitivo int 5 para o objeto Integer (autoboxing). Em seguida, percorra o array
// usando um laço for-each e some todos os seus elementos em uma variável int total.
// Note que, ao fazer a soma, o Java está convertendo o objeto Integer de volta para
// um int (unboxing). Imprima o total.
public class WrappersTest01 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[3];
        numeros[0] = 55;
        numeros[1] = 1;
        numeros[2] = 99;
        int total = 0;
        for (Integer numero : numeros) {
            total += numero;
        }
        System.out.println("A soma desses números é: " + total);
    }
}
