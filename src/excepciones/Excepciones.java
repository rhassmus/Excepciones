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
public class Excepciones {
    
   
    
    public static void main(String[] args) {
        
        int m;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Menu Excepciones");
        System.out.println("Escoja segun el numero; el ejemplo de excepcion a observar");
        System.out.println("1. Excepcion ArithmeticException");
        System.out.println("2. Excepcion seleccionada InputMismatchException");
        m = entrada.nextInt();
        switch(m) {
            case 1:
                System.out.println("Excepcion seleccionada ArithmeticException");
                Excepcion1 Ex1 =new Excepcion1();
                Ex1.p1();
                break;
            case 2:
                System.out.println("Excepcion seleccionada InputMismatchException");
                Excepcion2 Ex2 =new Excepcion2();
                Ex2.p2();
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        }
    }
}
