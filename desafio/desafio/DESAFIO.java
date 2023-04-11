/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.desafio;

import java.util.Scanner;

/**
 *
 * @author desktop
 */
public class DESAFIO {

    public static void main(String[] args) {

        while (true) {
            Scanner Ler = new Scanner(System.in);
            System.out.println("Escolha as seguintes opções de acordo com oque deseja\n"
                             + "*1* Adicionar uma banda\n"
                             + "*2* Visualizar a lista de bandas\n"
                             + "*3* Deletar uma banda\n"
                             + "*4* Deletar todas as bandas\n"
                             + "*5* Alterar a sequencia das bandas\n"
                             + "*6* Sair");
            int opcao = Ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção selecionada *Adicionar Banda*");
                    DesafioBandas.addBandas();
                    break;
                case 2:
                    System.out.println("Opção selecionada *Mostrar a lista de bandas*");
                    DesafioBandas.visualizar();
                    break;
                case 3:
                    System.out.println("Opção selecionada *Deletar uma banda*");
                    DesafioBandas.deletarBanda();
                    break;
                case 4:
                    System.out.println("Opção selecionada *Deletar todas as bandas*");
                    
                    break;
                case 5:
                    System.out.println("Opção selecionada *Alterar a sequencia das bandas*");
                    DesafioBandas.alterarSequencia();
                    break;
                case 6:
                    System.out.println("Você saiu do Sistema!");
                    DesafioBandas.deleteAll();
                    System.exit(0);
            }
        }
    }
}
