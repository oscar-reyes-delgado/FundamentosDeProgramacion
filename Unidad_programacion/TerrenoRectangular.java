package Unidad_programacion;
import java.util.Scanner;

public class TerrenoRectangular {
    public static void main(String[] args) {
        float medida1, medida2, precio;
        Scanner lector = new Scanner(System.in);

        System.out.println("====================================================================\n");
        System.out.println("Programa para calcular area y costo por m2 de un terreno rectangular\n");
        System.out.println("====================================================================\n");

        System.out.print("Escribe la medida de la base: ");
        medida1 = lector.nextFloat(); 

        System.out.print("Escribe la medida de la altura: ");
        medida2 = lector.nextFloat();

        System.out.print("Escribe el costo por m2: ");
        precio = lector.nextFloat();

        System.out.println("\nEl area de su terreno: " + (medida2*medida2));
        System.out.println("El precio de su terreno es: " + ((medida1*medida2)*precio));
        lector.close();
    }
}
