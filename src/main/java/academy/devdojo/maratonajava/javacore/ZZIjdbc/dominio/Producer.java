package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

@Value //classe imutável -> semelhante aos records.
@Builder //cria um builder

public class Producer {
    Integer id;
    String name;
}
