package Unidad_programacion;
import java.util.Scanner;

public class MayorDe3 {
    public static void main(String[] args) {
        Float n1, n2, n3, mayor;
        Scanner lector =  new Scanner(System.in);

        System.out.print("Escribe tu primer numero: ");
        n1 = lector.nextFloat();

        System.out.print("Escribe tu segundo numero: ");
        n2 = lector.nextFloat();

        System.out.print("Escribe tu tercer numero: ");
        n3 = lector.nextFloat();

        mayor = n1;

        if (n2>n1){
            mayor = n2;
        }
        else if (n3>n1){
            mayor = n3;
        }
        
        System.out.println("El mayor es " + mayor);
    }
}
