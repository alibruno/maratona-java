package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
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
        List<Producer> producers = ProducerService.findByNameCallableStatement("sasa");
        log.info("Producers found '{}'", producers);

    }
}
