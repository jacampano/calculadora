package es.jacampano.calculadora;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;

/* En función de sí está comentado o FixMethodOrder, el orden de ejecución puede variar.
   Si está activo, debería ejecutarse según el nombre de las clases:
    1º testA_sumar()
    2º testB_restar()
    3º testC_multiplicar()
   Si no está activo, no se garantiza el orden. En las pruebas realizadas con JDK 17, sigue el orden en el que aparece en el código
   1º testA_sumar()
   2º testC_multiplicar()
   3º testB_restar()
   
*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculadoraTestOrdenado {
    static Calculadora calculadora;
    private static int acumulador = 0;
    

    @BeforeClass
    public static void crearCalculadora(){
        System.out.println("beforeClass()");
        calculadora = new Calculadora();
    }

    @Test
    public void testA_sumar() {
        acumulador=calculadora.sumar(acumulador,5);
        System.out.println("Ejecutando testA_sumar: acumulador = " + acumulador);
        assertEquals(5, acumulador); //Me ejecuto en primer lugar. Acumulador 5
    }


    @Test
    public void testC_multiplicar() {
        acumulador = calculadora.multiplicar(acumulador,2) ;
        System.out.println("Ejecutando testC_multiplicar: acumulador = " + acumulador);
        assertEquals(4, acumulador); // Si FixMethodOrder(MethodSorters.NAME_ASCENDING) está descomentado, me ejecuto en último lugar. Acumulador 4. Si no es así, acumulador es 10
    }


    @Test
    public void testB_restar() {
        acumulador = calculadora.restar(acumulador,3); // Si FixMethodOrder(MethodSorters.NAME_ASCENDING) está descomentado, me ejecuto en segundo lugar. Acumulador 2 . Si no es así, acumulador es 7
        System.out.println("Ejecutando testB_restar: acumulador = " + acumulador);
        assertEquals(2, acumulador);
    }


}
