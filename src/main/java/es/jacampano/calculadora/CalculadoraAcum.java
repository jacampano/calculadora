package es.jacampano.calculadora;

public class CalculadoraAcum {

    private static CalculadoraAcum instancia;
    private int acumulador;

    private CalculadoraAcum() {
        this.acumulador = 0;
    }


    public static CalculadoraAcum getInstance() {
        if (instancia == null) {
            instancia = new CalculadoraAcum();
        }
        return instancia;
    }


    public void clear () {
        this.acumulador = 0;
    }

    public int sumar (int a , int b) {
        this.acumulador = a + b;
        return acumulador;
    }

    public int sumar(int a) {
        this.acumulador = this.acumulador +a ;
        return this.acumulador;
    }

    public int restar(int a, int b) {
        this.acumulador = a - b;
        return this.acumulador;
    }

    public int restar(int a) {
        this.acumulador = this.acumulador -a ;
        return this.acumulador;
    }

    public int multiplicar(int a) {
        this.acumulador = this.acumulador*a;
        
        return this.acumulador;
    }

    public double dividir(int a) {
        if (a == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }

        return (double) this.acumulador / a;
    }
}
