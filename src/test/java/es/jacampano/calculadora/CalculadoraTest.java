package es.jacampano.calculadora;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calculadora.dividir(6, 3), 0.001); // Para comparar doubles, incluye delta.
    }

   @Test(expected = IllegalArgumentException.class)
   //@Test(expected = RuntimeException.class)
   //@Test(expected = IOException.class)
    public void testDivisionPorCero() {
        calculadora.dividir(6, 0);
    }

    @Test
    public void testDivisionPorCeroFail() {
    try {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(10, 0);
        fail("Se esperaba una IllegalArgumentException pero no se lanzó.");
        } catch (IllegalArgumentException e) {
            assertEquals("No se puede dividir por cero", e.getMessage());
        }

    }

}