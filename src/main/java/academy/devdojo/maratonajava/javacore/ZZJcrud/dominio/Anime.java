package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

public record Anime(Integer id, String name, int episodes, Producer producer) {

    public static final class AnimeBuilder {
        private Integer id;
        private String name;
        private int episodes;
        private Producer producer;

        private AnimeBuilder() {
        }

        public static AnimeBuilder builder() {
            return new AnimeBuilder();
        }

        public AnimeBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public AnimeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AnimeBuilder episodes(int episodes) {
            this.episodes = episodes;
            return this;
        }

        public AnimeBuilder producer(Producer producer) {
            this.producer = producer;
            return this;
        }

        public Anime build() {
            return new Anime(id, name, episodes, producer);
        }
    }
}
