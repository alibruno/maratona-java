package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.dominio.Estagiario;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.dominio.FuncionarioCLT;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.dominio.FuncionarioPJ;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Paulo", 1510.0);
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Andrade", 3403.0);
        Estagiario estagiario = new Estagiario("Fagner", 950.0);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(estagiario);
    }
}
