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

        CalculadoraAcum calculadoraAcum = CalculadoraAcum.getInstance();
        int resAcum = calculadoraAcum.sumar(5);
        resAcum = calculadoraAcum.sumar(3);
        System.out.println("El resultado de rest tras las dos operaciones debe ser 8 y es:"+resAcum);

        CalculadoraAcum calculadoraAcum2 = CalculadoraAcum.getInstance();
        int resAcum2 = calculadoraAcum2.sumar(2);
        System.out.println("El restulado tras la operación anterior debe ser 10: "+resAcum2);

    }
}
