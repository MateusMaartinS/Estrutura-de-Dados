/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aulaestrutura;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AulaEstrutura {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numeros [] = new int[20];
        double real [] = new double[5];
        
        /**
         * Vetor de letras
         */
        String letras [] = new String [10];
        
        System.out.println("Digite 10 letras letra");
            for(int i=0; i<letras.length;i++){
                System.out.print(i+1+"º letra:");
                letras[i]=ler.nextLine();
        }
        System.out.println("As letras informadas foram: ");
            for(int i=0;i<letras.length;i++){
            System.out.print(" " + letras[i]);
        }
        /**
         * Vetor de números
         */        
        System.out.println("Digite 20 números");
            for(int i=0; i<numeros.length;i++){
                System.out.println(i+1+"º número:");
                numeros[i]=ler.nextInt();
        }
        System.out.println("Números informados: ");
            for(int i=0;i<numeros.length;i++){
                System.out.print(" /"+numeros[i]);
        }
        /**
         * Vetor de valores do tipo double
         */

        System.out.println("Digite 5 números com valores quebras \nex:10.5\n");
            for(int i=0; i<real.length;i++){
                System.out.print(i+1+"º número:");
                real[i]=ler.nextDouble();
        }
        System.out.println("Números informados");
            for(int i=0;i<real.length;i++){
                System.out.print(" /"+real[i]);
            }
    }
    
}
