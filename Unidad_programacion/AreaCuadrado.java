package Unidad_programacion;

import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {

        float lado;

        System.out.println("\n==================================");
        System.out.println("Calculadora de area de un cuadrado");
        System.out.println("==================================");
        Scanner lector = new Scanner(System.in);
        System.out.print("\nEscribe cuanto mide el lado de tu cuadrado: ");
        lado = lector. nextFloat();
        System.out.println("El area de su cuadrado es " + (lado * lado) + "unidades cuadradas");

        System.out.println("\nFin del programa\n");
        lector.close();

    }
}
