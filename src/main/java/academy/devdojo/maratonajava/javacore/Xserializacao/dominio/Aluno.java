package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 3100114304900343352L;

    private Long id;
    private String nome;
    private transient String passoword; // Atributo que não será serializado
    private static final String NOME_ESCOLA = "DevDojo"; // Obs: Atributos estáticos não são serializados, pois pertencem a uma classe e não objeto.
    private transient Turma turma;

    public Aluno(Long id, String nome, String passoword) {
        System.out.println("Construtor inicializado.");
        this.id = id;
        this.nome = nome;
        this.passoword = passoword;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passoword='" + passoword + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject(); // Sem transient
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject(); // Sem transient
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
