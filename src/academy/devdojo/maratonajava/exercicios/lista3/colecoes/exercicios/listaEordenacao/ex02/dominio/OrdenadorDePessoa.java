package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex02.dominio;

import java.util.Comparator;

public class OrdenadorDePessoa implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
}
