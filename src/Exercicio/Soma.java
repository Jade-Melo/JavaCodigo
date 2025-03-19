/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

import java.util.Scanner;

public class Soma {
    
    public static void main (String[] args){
        
        Scanner x = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Digite o numero1: ");
        numero1 = x.nextInt();
        
        System.out.println("Digite o numero2: ");
        numero2 = x.nextInt();
        
        int adicao = numero1 + numero2;
        System.out.println("O valor da soma é: "+ adicao);
        
    
    }
}


