package Unidad_programacion;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        double lado, area;

        System.out.println("\n==============================================");
        System.out.println("Calculadora de area de un triangulo equilatero");
        System.out.println("===============================================");
        Scanner lector = new Scanner(System.in);
        System.out.print("\nEscribe cuanto mide un lado de tu triangulo: ");

        lado = lector. nextDouble();
        area = (Math.sqrt(3)/4) * (lado * lado);

        System.out.println("El area de su triangulo equilatero es " + area + " unidades cuadradas");

        System.out.println("\nFin del programa\n");
        lector.close();

    }
}

