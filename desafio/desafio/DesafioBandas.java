/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author desktop
 */
public class DesafioBandas {
    
    ArrayList<String> lista = new ArrayList();
    Scanner ler = new Scanner(System.in);
    
    public void addBandas() {
        System.out.println("Coloque o nome da Banda: ");
        String addBanda = ler.next();
        lista.add(addBanda);
    }
    
    public void visualizar() {
        System.out.println("As Bandas Adicionadas foram: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " >> " + lista.get(i));
        }
    }
    
    public void deletarBanda() {
        System.out.println("A banda que deseja Excluir está em qual índice? ");
        int delete = ler.nextInt();
        if(delete >=0 && delete < lista.size()){
            lista.remove(delete);
        }else{
            System.out.println("Neste índice não possúi nenhuma banda!");
        }  
    }
    
    public void alterarSequencia(){
        System.out.println("Qual seria a Banda que deseja Alterar? ");
        int banda1 = ler.nextInt();
        System.out.println("Esta banda ficará no lugar de qual? ");
        int banda2 = ler.nextInt();
        if (banda1 >= 0 && banda2 >=0 && banda1 < lista.size() && banda2 < lista.size()){
            String invert = lista.get(banda1);
            lista.set(banda1, lista.get(banda2));
            lista.set(banda2, invert);
            System.out.println("Operação realizada com sucesso!");
        }else{
            System.out.println("Banda não encontrada!");
        }
    }
    
    public void deleteAll(){
        lista.clear();
        System.out.println("A lista foi deletada!");
    }
}

