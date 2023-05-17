/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacaobolha;

/**
 *
 * @author aluno
 */
public class OrdenacaoBolha {

    public static void main(String[] args) {
        int[] vetor = {4, 19, 56, 24, 73, 2, 8, 23};
        boolean houveTROCA = true;

        while (houveTROCA) {
            houveTROCA = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    houveTROCA = true;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao [" + i + "] = " + vetor[i]);
        }
    }
}
