package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    static void main() {
        Producer producerToUpdate = Producer.builder()
                .id(11)
                .name("Courtois")
                .build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
    }
}
