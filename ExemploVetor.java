/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplovetor;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class ExemploVetor {

    public static void main(String[] args) {

        /*String[] vetorNome = new String[5];
        
        vetorNome[0] = "Jonas";
        vetorNome[1] = "Jacó";
        
        for (int i = 0; i < vetorNome.length; i++) {
        String nome = JOptionPane.showInputDialog("Informe um nome");
        vetorNome[i] = nome;
        }
        String msg = "Nomes no vetor: \n";
        for (int i = 0; i < vetorNome.length; i++) {
            msg += "Posição: ["+ i +"] => "+vetorNome[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,msg);*/
        
        int [] vetorNumeros = {30,20,10,40};
        int chave;
        int j;
        
        for (int i = 1; i < vetorNumeros.length; i++ ){
            chave = vetorNumeros[i];
            
            for (j = i - 1; j>= 0 && vetorNumeros[j] > chave ; j--){
                vetorNumeros[j+1] = vetorNumeros[j];          
            
        }
            vetorNumeros[j+1] = chave;
    }      
    }
}
