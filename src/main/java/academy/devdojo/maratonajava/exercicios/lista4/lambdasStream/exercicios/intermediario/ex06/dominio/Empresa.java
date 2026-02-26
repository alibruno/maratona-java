package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex06.dominio;

public class Empresa {
    Departamento departamento;

    public Empresa(Departamento departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
