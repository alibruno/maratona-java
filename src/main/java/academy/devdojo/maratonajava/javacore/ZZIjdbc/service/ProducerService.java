package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer p) {
        ProducerRepository.save(p);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void deleteAll(List<Integer> idList) {
        if (idList.isEmpty()) {
            throw new IllegalArgumentException("The list of id's is empty");
        }
        for (Integer i : idList) {
            requireValidId(i);
        }
        ProducerRepository.deleteAll(idList);
    }

    public static void update(Producer p) {
        requireValidId(p.getId());
        ProducerRepository.update(p);
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}
