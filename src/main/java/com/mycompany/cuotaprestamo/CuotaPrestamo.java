package com.mycompany.cuotaprestamo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Cristian Quintero
 */
public class CuotaPrestamo {

    public static void main(String[] args) {
        //Declarar objeto para leer datos de entrada
        Scanner sc;

        //Crear la instancia del objeto para leer datos de entrada
        sc = new Scanner(System.in);

        System.out.println("Programa para calcular el valor de una cuota de un prestamo");

        //Mensaje para indicar la lectura del monto
        System.out.print("Monto a prestar?");

        //declarar la variable para el monto
        double monto;

        //leer la variable por el teclado
        monto = sc.nextDouble();

        //Mensaje para indicar la lectura de la tasa de interes
        System.out.print("Tasa de interes?");

        //declarar y leer la variable por el teclado
        double tasa = sc.nextDouble() / 100;

        System.out.print("Numero de meses?");
        int periodos = sc.nextInt();

        //calcular cuota 
        double cuota = monto * Math.pow(1 + tasa, periodos) * tasa / (Math.pow(1 + tasa, periodos) - 1);
        
        //instancia de la clase para formatear salida de numeros
        DecimalFormat df = new DecimalFormat("$ #, ##0.00");
        
        System.out.println("El valor de la cuota es " + df.format(cuota));
    }
}
