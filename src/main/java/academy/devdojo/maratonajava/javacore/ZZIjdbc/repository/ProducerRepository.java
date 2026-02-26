package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public class ProducerRepository {
    public static void save(Producer p) {
        // Statement -> alterar os dados de um banco de dados
        String sql = "INSERT INTO public.producer(\"name\") VALUES ('%s');".formatted(p.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in database, rows affected: '{}'", p.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", p.getName(), e);
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM public.producer WHERE id=%d;".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows affected: '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    public static void deleteAll(List<Integer> idList) {
        String collect = idList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        String sql = "DELETE FROM public.producer WHERE id IN (%s);".formatted(collect);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producers '{}' from the database, rows affected: '{}'", idList, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producers '{}'", idList, e);
        }

    }

    public static void update(Producer p) {
        String sql = "UPDATE public.producer SET \"name\"='%s' WHERE id=%d;".formatted(p.getName(), p.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}', rows affected: '{}'", p.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", p.getId(), e);
        }
    }
}
