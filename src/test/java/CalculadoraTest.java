import org.junit.Test;

import static org.junit.Assert.*;

class Calculadora {
    private final double a, b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double soma() {
        return this.a + this.b;
    }
}

public class CalculadoraTest {
    @Test
    public void testeSoma() {
        Calculadora c = new Calculadora(1, 4);
        assertEquals(5.0, c.soma(), 0.001);
    }
}
