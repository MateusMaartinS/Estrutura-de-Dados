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
        String letras [] = new String [10];
        
        System.out.println("Digite uma letra");
            for(int i=0; i<letras.length;i++){
                System.out.println("_");
              
              letras[i]= ler.nextLine();
        }
        System.out.println("Números Informados: ");
            for(int i=0;i<letras.length;i++){
              System.out.print("." + letras[i]);
     }
    }
    
}
