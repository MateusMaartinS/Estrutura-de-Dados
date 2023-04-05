/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ativ0404;

import java.util.*;

/**
 *
 * @author aluno
 */
public class ATIV0404 {

    public static void main(String[] args) {
        System.out.println("ATIV01");
        List<String> nomes = new ArrayList();
        nomes.add("João");
        nomes.add("Antonia");
        nomes.add("Marcelo");

        System.out.println(nomes);

        System.out.println("ATIV02");
        List<Integer> num = new ArrayList();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        System.out.println("O tamanho da lista é: " + num.size());

        System.out.println("ATIV03");
        List<Integer> numInt = new ArrayList();
        numInt.add(1);
        numInt.add(2);
        numInt.add(3);
        numInt.add(4);
        numInt.add(5);

        for (int i = 0; i < numInt.size(); i++) {
            if (numInt.get(i) % 2 == 0) {
                System.out.println("Os números que seram removidos são:" + numInt.get(i));
                numInt.remove(i);
            }
        }
        System.out.println("ATIV04");
        List<Integer> numeros = new ArrayList();
        numeros.add(12);
        numeros.add(32);
        numeros.add(56);

        System.out.println(numeros);

        System.out.println("ATIV05");
        int maior = 1;
        List<Integer> numMaio = new ArrayList();
        numMaio.add(325);
        numMaio.add(22);
        numMaio.add(73);
        numMaio.add(94);
        numMaio.add(10);

        for (int i = 0; i < numMaio.size(); i++) {
            if (numMaio.get(i) > maior) {
                maior = numMaio.get(i);
            }
        }
        System.out.println(maior);
    }
}