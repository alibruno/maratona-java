package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex06.dominio;

public class Departamento {
    Gerente gerente;

    public Departamento(Gerente gerente) {
        this.gerente = gerente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
