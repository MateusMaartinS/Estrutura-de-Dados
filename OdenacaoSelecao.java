/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.odenacaoselecao;

/**
 *
 * @author aluno
 */
public class OdenacaoSelecao {

    public static void main(String[] args) {
        int[] vetor = {4, 19, 56, 24, 73, 2, 8, 23};

        for (int i = 0; i < vetor.length - 1; i++) {
            int posMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posMenor];
                vetor[posMenor] = aux;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao [" + i + "] = " + vetor[i]);
        }
    }

}
