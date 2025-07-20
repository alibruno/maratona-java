package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios != null){
            for (int i = 0; i < seminarios.length; i++) {
                System.out.println("Seminário " + (i+1) + ": " + seminarios[i].getTitulo());
                if (seminarios[i].getAlunos() != null && seminarios[i].getAlunos().length != 0){
                    System.out.print("Alunos: ");
                    for (Aluno aluno : seminarios[i].getAlunos()) {
                        System.out.print(aluno.getNome() + "; ");
                    }
                    System.out.println();
                } else{
                    System.out.println("Alunos: Não há alunos cadastrados para esse seminário");
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
