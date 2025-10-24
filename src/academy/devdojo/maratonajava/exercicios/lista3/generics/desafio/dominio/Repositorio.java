package academy.devdojo.maratonajava.exercicios.lista3.generics.desafio.dominio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repositorio<T extends Entidade<ID>, ID> {
    Map<ID, T> map = new HashMap<>();

    // T -> TIPO QUE IMPLEMENTA ENTIDADE -> USUARIO OU PRODUTO
    // ID -> TIPO DA IMPLEMENTAÇÃO DA ENTIDADE -> INTEGER(USUARIO) OU STRING(PRODUTO)

    public void adicionar(T entidade) {
        map.put(entidade.getId(), entidade);
    }

    public T buscarPorId(ID id) {
        if (map.get(id) == null) {
            throw new RuntimeException("\"id = " + id + "\" é inexistente.");
        }
        return map.get(id);
    }

    public Collection<T> listarTodos() {
        return map.values();
    }

    public void remover(ID id) {
        if (map.get(id) == null) {
            throw new RuntimeException("\"id = " + id + "\" é inexistente.");
        }
        map.remove(id);
    }
}
