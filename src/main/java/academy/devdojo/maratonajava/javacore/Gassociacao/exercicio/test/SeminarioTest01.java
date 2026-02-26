package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {

        Local local1 = new Local("Sala 46");
        Local local2 = new Local("Audiovisual 01");

        Seminario seminarioHistoria01 = new Seminario("Guerra fria", local1);
        Seminario seminarioMatematica01 = new Seminario("Análise combinatória", local1);
        Seminario seminarioMatematica02 = new Seminario("Polinômios", local2);

        Seminario[] quantSeminariosHistoria = {seminarioHistoria01};
        Seminario[] quantSeminariosMatematica = {seminarioMatematica01, seminarioMatematica02};

        Professor professor1 = new Professor("Assis", "Historia");
        Professor professor2 = new Professor("Francisco José", "Matemática");

        professor1.setSeminarios(quantSeminariosHistoria);
        professor2.setSeminarios(quantSeminariosMatematica);

        Aluno aluno1 = new Aluno("Otávio", 18);
        Aluno aluno2 = new Aluno("Lincol", 18);
        Aluno aluno3 = new Aluno("Manoel", 18);
        Aluno aluno4 = new Aluno("Pedro", 18);
        Aluno aluno5 = new Aluno("Lara", 18);
        Aluno aluno6 = new Aluno("Anick", 18);
        Aluno aluno7 = new Aluno("Beatriz", 18);
        Aluno aluno8 = new Aluno("Lilian", 18);
        Aluno aluno9 = new Aluno("Chico", 18);

        aluno1.setSeminario(seminarioMatematica01);
        aluno2.setSeminario(seminarioMatematica01);
        aluno5.setSeminario(seminarioMatematica01);
        aluno6.setSeminario(seminarioMatematica01);

        aluno3.setSeminario(seminarioHistoria01);
        aluno4.setSeminario(seminarioHistoria01);
        aluno7.setSeminario(seminarioHistoria01);
        aluno8.setSeminario(seminarioHistoria01);

        Aluno[] alunosSeminarioMatematica01 = {aluno1, aluno2, aluno5, aluno6};
        Aluno[] alunosSeminarioHistoria01 = {aluno3, aluno4, aluno7, aluno8};

        seminarioHistoria01.setAlunos(alunosSeminarioHistoria01);
        seminarioMatematica01.setAlunos(alunosSeminarioMatematica01);

        System.out.println("...........TESTES...........");

        // Sem seminário
        aluno9.imprime();
        System.out.println("------------------------------------");

        // Participando de um seminário
        aluno6.imprime();
        System.out.println("------------------------------------");

        // Seminários ministrados (mesmo que um deles não tenha alunos)
        professor2.imprime();
        System.out.println("------------------------------------");

        // Tudo que remete ao seminário de História
        seminarioHistoria01.imprime();
        System.out.println("------------------------------------");

        // Seminário sem aluno
        seminarioMatematica02.imprime();
    }
}
