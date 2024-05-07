package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        String nombre = "Juan Zapata";
        int salarioBase = 45000000;
        int horasTrabajo = 192;
        int horasExtras = 10;
        double auxilioTransporte = 162000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras);
        double deducciones = calcularDeducciones(salarioDevengado, auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

         // Impresión de la nómina
        imprimirNomina(nombre, salarioBase, horasExtras, auxilioTransporte, salarioDevengado, deducciones, salarioNeto);
    }
    // Método para calcular el salario devengado
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras) {
        // Implementar solución
        int valorHora = salarioBase / horasTrabajo;
        double salarioDevengado = salarioBase + (horasExtras * valorHora * 1.5);
        return salarioDevengado;
    }
    // Método para calcular las deducciones
    public static double calcularDeducciones(double salarioDevengado, double auxilioTransporte) {
        // Implementar solución
        double deducciones = 0;
        if (salarioDevengado <= 3634104) {
            deducciones += auxilioTransporte;
        }
        return deducciones;
    }

    public static void imprimirNomina(String nombre, int salarioBase, int horasExtras, double auxilioTransporte, double salarioDevengado, double deducciones, double salarioNeto) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);

        //Ejercicio 2------------------------------------------------------------------------
        adivinarNumero(1, 100, 5);
    }

    // Método para adivinar un número aleatorio
    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(max_numero - min_numero + 1) + min_numero;
        int intentos = 0;
        
        System.out.println("El número esta entre " + min_numero + " y " + max_numero + ". Adivinalo");

        while (intentos < max_intentos) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int suposicion = scanner.nextInt();
            intentos++;

            if (suposicion == numeroAleatorio) {
                System.out.println("Has adivinado el número en " + intentos + " intento(s)");
                return;
            } else if (suposicion < numeroAleatorio) {
                System.out.println("El número que estoy pensando es mayor que " + suposicion);
            } else {
                System.out.println("El número que estoy pensando es menor que " + suposicion);
            }
        
        }
        System.out.println("Has agotado tus " + max_intentos + " intentos. El número era: " + numeroAleatorio);
    
        //Ejercicio 3------------------------------------------------
        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base * 3; // Suma de los lados en un triángulo equilátero

        System.out.println("El área del triángulo es: " + area);
        System.out.println("El perímetro del triángulo es: " + perimetro);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = scanner.nextDouble();

        double area = lado * lado;
        double perimetro = lado * 4;

        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + perimetro);
    }
}

