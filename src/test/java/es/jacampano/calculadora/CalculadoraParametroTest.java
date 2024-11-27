package es.jacampano.calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {
    private int a,b,exp;

    public CalculadoraParametroTest(int a, int b, int exp) {
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @Parameters
    public static Iterable<Object[]> getData() {
        List<Object[]> params = new ArrayList<>();
        params.add(new Object[] {3,1,4});
        params.add(new Object[] {2,3,5});
        params.add(new Object[] {3,3,6});
        return params;
        
    }

    @Test
    public void testAdd() {
        Calculadora calculadora = new Calculadora();
        assertEquals(exp, calculadora.sumar(a,b));
    }

}
