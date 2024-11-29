package es.jacampano.calculadora;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {
    private int a,b,exp;
    enum TipoOperacion {SUMA, MULTIPLICACION};
    private TipoOperacion tipoOperacion;

    public CalculadoraParametroTest(TipoOperacion tipoOperacion,int a, int b, int exp) {
        this.tipoOperacion = tipoOperacion;
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    /* 
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }
    */
    @Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> params = new ArrayList<>();
        params.add(new Object[] {TipoOperacion.SUMA, 3,1,4});
        params.add(new Object[] {TipoOperacion.SUMA,2,3,5});
        params.add(new Object[] {TipoOperacion.SUMA,3,3,6});
        params.add(new Object[] {TipoOperacion.MULTIPLICACION, 2, 3, 6}); 
        params.add(new Object[] {TipoOperacion.MULTIPLICACION, -2, 3, -6}); 
        params.add(new Object[] {TipoOperacion.MULTIPLICACION, -2, -3, 6}); 
        return params;
        
    }

    @Test
    public void testSumar() {
        assumeTrue(tipoOperacion == TipoOperacion.SUMA);
        Calculadora calculadora = new Calculadora();
        assertEquals(exp, calculadora.sumar(a,b));
    }

    @Test
    public void testMultiplicar() {
        
        assumeTrue(tipoOperacion == TipoOperacion.MULTIPLICACION);
        Calculadora calculadora = new Calculadora();
        assertEquals(exp, calculadora.multiplicar(a,b));

    }
}
