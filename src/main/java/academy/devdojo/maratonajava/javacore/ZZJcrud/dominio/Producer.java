package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

public record Producer(Integer id, String name) {

    public static final class ProducerBuilder {
        private Integer id;
        private String name;

        private ProducerBuilder() {
        }

        public static ProducerBuilder builder() {
            return new ProducerBuilder();
        }

        public ProducerBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public ProducerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Producer build() {
            return new Producer(id, name);
        }
    }
}
