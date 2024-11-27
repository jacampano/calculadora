package es.jacampano.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class OtrosEjemplosTest {
    private final OtrosEjemplos ejemplo = new OtrosEjemplos();

    @Test(timeout = 2000)
    public void testAlgoritmoOptimo() {
        ejemplo.operacionOptima();

    }

}
