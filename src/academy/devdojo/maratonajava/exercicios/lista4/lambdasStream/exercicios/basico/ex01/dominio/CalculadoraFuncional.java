package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.basico.ex01.dominio;
//    Contexto: Entendimento de interfaces funcionais customizadas.
//
//    Tarefa: Defina uma interface funcional OperacaoMatematica com o metodo int operar(int a, int b).
//    Implemente somar, subtrair, multiplicar e dividir usando lambdas.
//    Teste-as aplicando em dois números.
@FunctionalInterface
public interface CalculadoraFuncional {
    int operar(int a, int b);
}
