package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }


    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - %s%n", p.id(), p.name()));
    }

    private static void delete() {
        System.out.println("Type the id of the producer to be deleted");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String answer = SCANNER.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.ProducerBuilder.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the id of the producer to be updated");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found " + producerFromDb);
        System.out.println("Type the new name of the producer to be updated");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.name() : name;
        Producer producerToUpdate = Producer.ProducerBuilder
                .builder()
                .id(producerFromDb.id())
                .name(name)
                .build();
        ProducerRepository.update(producerToUpdate);
    }
}
