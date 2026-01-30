package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.basico.ex02.test;

import java.util.Optional;

//    Contexto: Evitar verificações de nulo manuais.
//
//    Tarefa: Escreva um metodo Optional<String> obterNome(Integer id) que retorna
//    Optional.empty() se o id for negativo e Optional.of("Usuario " + id) caso contrário.
//    No main, chame o metodo e imprima o nome ou "ID Inválido" usando orElse.

public class VerificarIDTest01 {
    public static void main(String[] args) {
        System.out.println(obterNome(-1).orElse("ID inválido"));
        System.out.println(obterNome(7).orElse("ID inválido"));
    }

    private static Optional<String> obterNome(Integer id){
        if (id < 0){
            return Optional.empty();
        }
        return Optional.of("Usuario " + id);
    }
}
