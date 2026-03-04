package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;

import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
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
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding Producer by name '{}'", name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                producers.add(
                        Producer.ProducerBuilder
                                .builder()
                                .id(rs.getInt("id"))
                                .name(rs.getString("name"))
                                .build()
                );
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producers;
    }

    private static PreparedStatement createPrepareStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM public.producer where name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Producer> findById(Integer id) {
        log.info("Finding Producer by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(
                    Producer.ProducerBuilder
                            .builder()
                            .id(rs.getInt("id"))
                            .name(rs.getString("name"))
                            .build()
            );
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPrepareStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM public.producer WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(int id) {
        try (Connection conn = academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementDelete(conn, id);) {
            ps.executeUpdate();
            log.info("Deleted producer '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    private static PreparedStatement createPrepareStatementDelete(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM public.producer WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving Producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, producer)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.id(), e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO public.producer(\"name\") VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.name());
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating Producer '{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.id(), e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE public.producer SET \"name\"=? WHERE id=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.name());
        ps.setInt(2, producer.id());
        return ps;
    }
}
