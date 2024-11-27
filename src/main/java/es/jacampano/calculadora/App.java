package es.jacampano.calculadora;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculadora calculadora = new Calculadora(); 
        int a = 2, b = 3;
        int res = calculadora.sumar(a,b);
        System.out.println("El resultado de sumar "+a+" y "+b+" es "+res);

    }
}
