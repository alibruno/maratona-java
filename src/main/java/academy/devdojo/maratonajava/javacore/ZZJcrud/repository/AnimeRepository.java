package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}'", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.ProducerBuilder
                        .builder()
                        .id(rs.getInt("producer_id"))
                        .name(rs.getString("producer_name"))
                        .build();
                Anime anime = Anime.AnimeBuilder
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episode"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
        }
        return animes;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episode, a.producer_id, p.name AS \"producer_name\" FROM public.anime a INNER JOIN
                public.producer p ON a.producer_id = p.id
                WHERE a.name LIKE ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding Anime by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.ProducerBuilder
                    .builder()
                    .name(rs.getString("producer_name"))
                    .id(rs.getInt("producer_id"))
                    .build();
            Anime anime = Anime.AnimeBuilder
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episode"))
                    .producer(producer)
                    .build();
            return Optional.of(anime);
        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episode, a.producer_id, p.name AS "producer_name" FROM public.anime a INNER JOIN
                public.producer p ON a.producer_id = p.id
                WHERE a.id=?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id);) {
            ps.executeUpdate();
            log.info("Deleted anime '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM public.anime WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        log.info("Saving Anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, anime)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.id(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO public.anime (\"name\",episode,producer_id) VALUES (?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.name());
        ps.setInt(2, anime.episodes());
        ps.setInt(3, anime.producer().id());
        return ps;
    }

    public static void update(Anime anime) {
        log.info("Updating Anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, anime)) {
            int rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            log.error("Error while trying to update anime '{}'", anime.id(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws
            SQLException {
        String sql = "UPDATE public.anime SET \"name\"=?,episode=? WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.name());
        ps.setInt(2, anime.episodes());
        ps.setInt(3, anime.id());
        return ps;
    }
}
