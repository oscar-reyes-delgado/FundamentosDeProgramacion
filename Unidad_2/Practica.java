package Unidad_2;
import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        float promedio, ingresofam;
        System.out.println("==================================================");
        System.out.println("Dictamen de financiamiento educativo universitario");
        System.out.println("==================================================");

        Scanner lector = new Scanner(System.in);
        System.out.print("Esriba su promedio: ");
        promedio = lector.nextFloat();
        System.out.print("Escriba su ingreso familiar mensual: ");
        ingresofam = lector.nextFloat();
        lector.close();

        if (promedio >= 90){
            if (ingresofam <= 15000){
                System.out.println("Se dictamina \"Beca de excelencia\" con tasa de interes del 0%");
            }
            else{
                System.out.println("Se otorga \"Credito Preferente\" con tasa de interes del 3%");
            }
        }
        else if (promedio < 90 && promedio >= 75) {
            if (ingresofam <= 20000){
                System.out.println("Se asigna \"Credito ordinario\" con tasa de interes del 6%");
            }
            else{
                System.out.println("Se otorga \"Credito condicionado\" con tasa de interes del 9%");
            }
        }
        else{
            System.out.println("Se dictamina \"Rechazada por Criterio Academico\"");
        }
    }
}
