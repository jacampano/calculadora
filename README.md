# Proyecto Calculadora con JUnit

Este es un proyecto simple de **Calculadora** en Java, que implementa operaciones básicas como sumar, restar, multiplicar y dividir. El proyecto utiliza **JUnit 4** para realizar pruebas unitarias sobre las funcionalidades de la calculadora.

## Características

- **Operaciones Básicas**: Suma, resta, multiplicación y división.
- **Pruebas Unitarias**: Utiliza **JUnit 4** para probar las funcionalidades de la calculadora.
- **Manejo de Excepciones**: Maneja excepciones como la división por cero.

## Requisitos

- **Java 8** o superior
- **Maven** para gestionar dependencias y ejecutar los tests.
- **JUnit 4** como framework de pruebas unitarias.

## Instalación

Para empezar con el proyecto, sigue estos pasos:

1. Clona este repositorio:

    ```bash
    git clone https://github.com/tu_usuario/calculadora.git
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd calculadora
    ```

3. Si no tienes las dependencias de Maven descargadas, ejecuta el siguiente comando:

    ```bash
    mvn clean install
    ```

## Uso

Este proyecto contiene una clase `Calculadora` con los métodos de operaciones matemáticas. Aquí hay un ejemplo de cómo usarla:

```java
import es.jacampano.calculadora.Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.sumar(2, 3));
        System.out.println("Resta: " + calculadora.restar(5, 3));
        System.out.println("Multiplicación: " + calculadora.multiplicar(4, 3));
        System.out.println("División: " + calculadora.dividir(6, 2));
    }
}
