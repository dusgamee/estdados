/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author 00240413
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int[]vetor = {10,20,30,40,50};
        int numeroPesquisar = 40;
        
        JOptionPane.showMessageDialog(null , "O elemento 40 esta na posicao: "+ pesquisaLinear(numeroPesquisar, vetor));
        
    }
    public static int pesquisaLinear(int numPesq, int[]vet){
        
        for(int i = 0;i< vet.length;i++){
            if(numPesq == vet[i]){
                return i;
            }
        }
        return -1;
    }
}

