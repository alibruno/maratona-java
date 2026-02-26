package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.test;


import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.SenhaCurtaException;
import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.SenhaSemMaiusculaException;
import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.SenhaSemNumeroException;
import academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio.ValidadorDeSenhasComRegex;

public class ValidadorDeSenhasComRegexTest01 {
    public static void main(String[] args) {
        ValidadorDeSenhasComRegex validadorDeSenhasComRegex = new ValidadorDeSenhasComRegex();
        String senha = "Admin123";
        try {
            validadorDeSenhasComRegex.validarSenha(senha);
        } catch (SenhaCurtaException | SenhaSemMaiusculaException | SenhaSemNumeroException e){
            System.out.println(e.getMessage());
        }
    }
}
