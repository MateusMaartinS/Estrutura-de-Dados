/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aula0404;

import java.util.*;

/**
 *
 * @author aluno
 */
public class AULA0404 {

    public static void main(String[] args) {

        List<String> nome = new ArrayList();
        nome.add("Jonas");
        nome.add("Abner");
        nome.add("Bianca");
        Collections.sort(nome);

        for (String i : nome) {
            System.out.println(i);
        }

        ArrayList<Integer> idade = new ArrayList<>();
        idade.add(15);
        idade.add(35);
        idade.add(23);
        Collections.sort(idade);
        for (int i = 0; i < idade.size(); i++) {
            System.out.println(idade.get(i));
        }
    }
}
