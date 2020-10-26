/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ1_condicional_joaogabriel;

import java.util.Scanner;

/**
 *
 * @author João Gabriel
 */
public class Ativ1_Condicional_JoaoGabriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num;
       System.out.print("Digite um numero: ");
       num = entrada.nextInt();
       
       if(num%2==0)
       System.out.println("Número é par");
        
        else
        System.out.println("Número é í­mpar");
    }
    
}
