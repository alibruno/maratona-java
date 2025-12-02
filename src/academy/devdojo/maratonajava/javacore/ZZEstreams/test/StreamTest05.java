package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> musicalNotes = List.of("Do", "Do", "Re", "Mi", "Fa", "Sol", "La", "Si");
        List<String> musicalNotesChars = musicalNotes.stream()
                .map(mn -> mn.split(""))
                .flatMap(Arrays::stream)
                .toList();

        // .stream() -> Stream<String>
        // .map() -> Stream<String[]>
        // .flatMap() -> Stream<String>
    }
}
