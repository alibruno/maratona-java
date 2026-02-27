package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ConnectionFactoryTest01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTest01.class);

    static void main() {
//        Producer producer = Producer.builder()
//                .id(1)
//                .name("Porfirio")
//                .build();
//        ProducerService.save(producer);
//        List<Producer> producers = ProducerService.findByName("il");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showDriverMetaData();
//        List<Producer> producers = ProducerService.findByName("il");
        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Mike");
        log.info("Producers found '{}'", producers);

    }
}
