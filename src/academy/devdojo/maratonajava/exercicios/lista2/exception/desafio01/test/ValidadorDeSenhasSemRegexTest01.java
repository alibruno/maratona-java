package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.test;

import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.SenhaCurtaException;
import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.SenhaSemMaiusculaException;
import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.SenhaSemNumeroException;
import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.ValidadorDeSenhasSemRegex;

public class ValidadorDeSenhasSemRegexTest01 {
    public static void main(String[] args) {
        ValidadorDeSenhasSemRegex validadorDeSenhasSemRegex = new ValidadorDeSenhasSemRegex();
        String senha = "Admin123";
        try {
            validadorDeSenhasSemRegex.validarSenha(senha);
        } catch (SenhaCurtaException | SenhaSemMaiusculaException | SenhaSemNumeroException e){
            System.out.println(e.getMessage());
        }
    }
}
