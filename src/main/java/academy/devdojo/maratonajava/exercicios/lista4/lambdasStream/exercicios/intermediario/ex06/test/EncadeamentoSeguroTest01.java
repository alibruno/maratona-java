package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex06.test;

//     Contexto: Navegação em grafos de objetos possivelmente nulos.
//
//    Tarefa: Considere as classes Empresa -> Departamento -> Gerente. Todos os métodos de acesso podem retornar null.
//    Crie uma cadeia usando Optional que, dada uma Empresa, retorna o nome do gerente do departamento principal ou
//    "Sem Gerente". Note a diferença entre usar map (se o metodo retorna objeto) e flatMap (se o metodo já retorna Optional).

import academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex06.dominio.Departamento;
import academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex06.dominio.Empresa;
import academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex06.dominio.Gerente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EncadeamentoSeguroTest01 {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa(new Departamento(new Gerente("Mário")));
        Empresa emp2 = new Empresa(new Departamento(null));
        Empresa emp3 = new Empresa(null);

        imprimirNomeGerente(emp1);
        imprimirNomeGerente(emp2);
        imprimirNomeGerente(emp3);
    }

    private static void imprimirNomeGerente(Empresa empresa) {
        String resultado = Optional.ofNullable(empresa)
                .map(Empresa::getDepartamento)  // Pega o Departamento (pode ser null)
                .map(Departamento::getGerente)  // Pega o Gerente (pode ser null)
                .map(Gerente::getNome)          // Pega a String nome
                .orElse("Sem Gerente");

        System.out.println("Gerente: " + resultado);
    }
}
