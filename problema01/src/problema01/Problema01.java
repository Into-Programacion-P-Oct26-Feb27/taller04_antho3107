/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //declaracion de variables 
        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gastoPro1;
        double gastoPro2;
        double gastoPro3;
        double gastoTotal;
        
        System.out.println("Ingrese el nombre del proyecto 1:");
        proyecto1 = entrada.nextLine();
        
        System.out.println("Ingrese el nombre del proyecto 2:");
        proyecto2 = entrada.nextLine();
        
        System.out.println("Ingrese el nombre del proyecto 3:");
        proyecto3 = entrada.nextLine();
        
        System.out.println("Ingrese el gasto mensual del proyecto 1");
        gastoPro1 = entrada.nextDouble();
        
        System.out.println("Ingrese el gasto mensual del proyecto 2");
        gastoPro2 = entrada.nextDouble();
        
        System.out.println("Ingrese el gasto mensual del proyecto 3");
        gastoPro3 = entrada.nextDouble();
        
        gastoTotal = gastoPro1 + gastoPro2 + gastoPro3;
        
        System.out.printf("CONTROL DE GASTOS DE PROYECTOS\nProyectos:\n"
                + "-------------\n1.%s: $%.2f\n2.%s: $%.2f\n3.%s: $%.2f\n"
                + "-------------\nGASTO MENSUAL TOTAL: $%.3f\n",
        proyecto1,
        gastoPro1,
        proyecto2,
        gastoPro2,
        proyecto3,
        gastoPro3,
        gastoTotal);
    }
}
    

