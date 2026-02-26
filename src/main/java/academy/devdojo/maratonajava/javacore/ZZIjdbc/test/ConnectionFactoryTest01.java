package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTest01 {
    static void main() {
        Producer producerToUpdate = Producer.builder()
                .id(1)
                .name("Bilbo")
                .build();
//        ProducerService.save(producer);
        ProducerService.update(producerToUpdate);
    }
}
