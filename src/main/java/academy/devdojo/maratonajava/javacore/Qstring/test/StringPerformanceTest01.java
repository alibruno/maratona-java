package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        // A performace da String a medida que aumenta o tamanho da iteração (Strings únicas) diminui consideravelmente;
        long inicio = System.currentTimeMillis();
        concaString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução (String): " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuilder(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução (StringBuilder): " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuffer(30000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução (StringBuffer): " + (fim - inicio) + "ms");

    }

    private static void concaString(int tamanho) {
        String txt = "";
        for (int i = 0; i < tamanho; i++) {
            txt += i;
        }
    }

    private static void concaStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concaStringBuffer(int tamanho) { // Semelhante ao StringBuilder, mas com ênfase em threads
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
