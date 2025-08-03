package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        // Exceção não tratada (sem try{} catch(){}) -> JVM encerra execução do main
        divisao(1,0);
        System.out.println("Execução encerrada.");
    }

    /**
     *
     * @param a dividendo
     * @param b divisor - não pode ser zero
     * @return divide a por b
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal. Não é possível dividir por 0.");
        }
        return a/b;
    }
}