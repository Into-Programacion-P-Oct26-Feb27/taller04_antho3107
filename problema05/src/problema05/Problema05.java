/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //Declaracion de variables
        String nombre;
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        double des1;
        double des2;
        double des3;
        double des4;
        double valornetflix;
        double valoryoutube;
        double valordropbox;
        double valorspotify;
        double valorsindesc;
        double ahorromensual;
        double valorcondesc;
       
        System.out.println("Ingrese su nombre y apellido:");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el precio de Netflix:");
        netflix = entrada.nextDouble();
        
        System.out.println("Ingrese el precio de Youtube Premium:");
        youtube = entrada.nextDouble();
        
        System.out.println("Ingrese el precio de Dropbox:");
        dropbox = entrada.nextDouble();
        
        System.out.println("Ingrese el precio de Spotify:");
        spotify = entrada.nextDouble();
        
        //Descuentos
        des1 = netflix * 0.23;
        des2 = youtube * 0.23;
        des3 = dropbox * 0.45;
        des4 = 0.0;
        
        //Precio finales por servicio
        valornetflix = netflix - des1;
        valoryoutube = youtube - des2;
        valordropbox = dropbox - des3;
        valorspotify = spotify - des4;
        
        //Otros Calculos
        valorsindesc = netflix + youtube + dropbox + spotify;
        ahorromensual = des1 + des2 + des3 + des4;
        valorcondesc= valornetflix + valoryoutube + valordropbox + valorspotify;
        
        
        System.out.printf("------------------\nREPORTE DE SERVICIOS DIGITALES\n"
                + "------------------\nCliente: %s\n--Netflix--\n"
                + "Precio base: $%.2f | Descuento (23%%): $%.2f | "
                + "Precio final: $%.2f\n--Youtube--\nPrecio base: $%.2f "
                + "| Descuento (23%%): $%.2f | Precio final: $%.2f\n"
                + "--Dropbox--\nPrecio base: $%.2f | Descuento (45%%): $%.2f | "
                + "Precio final: $%.2f\n--Spotify--\nPrecio base: $%.2f | "
                + "Descuento (0%%): $%.2f | Precio final: $%.2f\n------------\n"
                + "Costo sin descuento: $%.2f\nAhorro mensula: $%.2f\n"
                + "Valor total a pagar mensualmente: $%.2f\n-----------------\n",
                nombre,
                netflix,des1,valornetflix,
                youtube,des2,valoryoutube,
                dropbox,des3,valordropbox,
                spotify,des4,valorspotify,
                valorsindesc,ahorromensual,valorcondesc);
    }  
}
