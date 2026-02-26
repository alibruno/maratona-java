package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.strings.ex02.test;

// Crie um programa que demonstre a diferença de performance entre String e StringBuilder. Crie um
// laço que se repete 100.000 vezes. Dentro do laço, concatene o número da iteração a uma variável
// String usando o operador +. Marque o tempo de início e o tempo de fim da operação e calcule a
// duração. Em seguida, faça a mesma operação, mas usando um objeto StringBuilder e seu metodo
// append(). Meça o tempo novamente. Compare os resultados e explique por que StringBuilder é
// drasticamente mais rápido nesse cenário, relacionando com a imutabilidade das Strings.

public class StringAndStringBuilderTest01 {
    public static void main(String[] args) {
        int tamanhoLaco = 100_000;

        String concatString = "";
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < tamanhoLaco; i++) {
            concatString += i;
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de concatenação (String): " + (fim-inicio) + "ms");

        StringBuilder sb = new StringBuilder(tamanhoLaco);
        inicio = System.currentTimeMillis();
        for (int i = 0; i < tamanhoLaco; i++) {
            sb.append(i);
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo de concatenação (StringBuilder): " + (fim-inicio) + "ms");
    }
}
