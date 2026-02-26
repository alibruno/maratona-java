package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        // Essas exceções recebem o mesmo tratamento
        // 'e' não poderá ser associado a outra exceção em caso de multi catch
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try{
            testException();
        } catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void testException() throws SQLException, FileNotFoundException {

    }
}
