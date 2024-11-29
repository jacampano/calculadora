package es.jacampano.calculadora;


import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;


public class CalculadoraAcumTest {

    private CalculadoraAcum calculadora;

    @Before
    public void setUp() {
        calculadora = CalculadoraAcum.getInstance();
    }

    @After
    public void reset() {
        calculadora.clear();
    }

    @Test
    public void testSumar() {
        assertEquals(10, calculadora.sumar(10));
    }

    @Test
    public void testRestar() {
        assertEquals(-2, calculadora.restar(2));
    }

    @Test
    public void testMultiplicar() {
        calculadora.sumar(10);
        assertEquals(20, calculadora.multiplicar(2));
    }

    @Test
    public void testDividir() {
        calculadora.sumar(10);
        assertEquals(5.0, calculadora.dividir(2), 0.001); // Para comparar doubles, incluye delta.
    }

}