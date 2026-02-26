package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner input = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj3";
        System.out.println("Usuário");
        String usernameInput = input.nextLine();
        System.out.println("Senha");
        String senhaInput = input.nextLine();
        if (!usernameInput.equals(usernameDB) || !senhaDB.equals(senhaInput)){
//            throw new LoginInvalidoException(); -> "Login inválido"
            throw new LoginInvalidoException("Usuário ou senha inválido");
        }
        System.out.println("Usuário logado com sucesso.");
    }
}
