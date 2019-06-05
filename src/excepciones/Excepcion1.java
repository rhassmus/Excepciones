/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;


/**
 *
 * @author Andres
 */
public class Excepcion1 {
    public static int numerador;
    public static Integer denominador = 0;
    public static float division;
    public void p1 (){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese cualquier numero a dividir entre cero");
        numerador= entrada.nextInt();
        try {
            division= numerador / denominador;
        }
            catch(ArithmeticException ex){ 
            division=0;
            System.out.println("Error, no se puede dividir entre cero");
        }
        
    }    
}
