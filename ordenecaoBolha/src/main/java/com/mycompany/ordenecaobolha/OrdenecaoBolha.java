/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenecaobolha;

/**
 *
 * @author 00240413
 */
public class OrdenecaoBolha {

    public static void main(String[] args) {
        int[] vetor = {30, 20, 10, 40, 50, 70,120, 140, 130};
        boolean troca = true;
        long inicio = System.currentTimeMillis();

        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }

        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);

        }
        System.out.println("tempo de  execucao: " + tempoExecucao);
    }
}
