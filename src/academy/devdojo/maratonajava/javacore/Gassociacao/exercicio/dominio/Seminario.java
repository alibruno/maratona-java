package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime(){
        System.out.println("Título: " + this.titulo);
        if (alunos != null){
            System.out.print("Alunos: ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + "; ");
            }
            System.out.println();
        }
        if (local != null){
            System.out.println("Local: " + local.getEndereco());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
