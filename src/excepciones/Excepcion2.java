/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Excepcion2 {
    
    public static int numero;
    public void p2 (){

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        numero= entrada.nextInt();
        try {
            System.out.println("Elnumero ingrasado es= "+numero);
        }
        catch(InputMismatchException e){ 
            entrada.nextLine();
            numero=0;
            System.out.println("Debe introducir un número entero "+e);
        }
        
    }
    
}
