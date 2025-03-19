/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JADE_4567
 */
public class Atividade {


public class Calculadora {
    
    void somar(){
        
        Scanner x = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Digite o numero1: ");
        numero1 = x.nextInt();
        
        System.out.println("Digite o numero2: ");
        numero2 = x.nextInt();
        
        int adicao = numero1 + numero2;
        System.out.println("O valor da soma é: "+ adicao);
                
    }
    
     void subtracao(){
        
        Scanner x = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Digite o numero1: ");
        numero1 = x.nextInt();
        
        System.out.println("Digite o numero2: ");
        numero2 = x.nextInt();
        
        int subtracao = numero1 - numero2;
        System.out.println("O valor da subtracao é: "+ subtracao);
    }
    
    void multiplicao(){
        
        Scanner x = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Digite o numero1: ");
        numero1 = x.nextInt();
        
        System.out.println("Digite o numero2: ");
        numero2 = x.nextInt();
        
        int multiplicacao = numero1 * numero2;
        System.out.println("O valor da multiplicacao é: "+ multiplicacao);
    }
    
    void divisao(){
        
        Scanner x = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Digite o numero1: ");
        numero1 = x.nextInt();
        
        System.out.println("Digite o numero2: ");
        numero2 = x.nextInt();
        
        int divisao = numero1 / numero2;
        System.out.println("O valor da divisao é: "+ divisao);
    }

    }

    public class CaixadeDialogo {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        JOptionPane.showMessageDialog(null, nome + "Sua idade é: " + idade);
    }   
    }
    
    public class EstruturadeDecisao {
    
    public static void main(String[] args) {
        
        int idade = 17;
        
        if(idade >= 18){
            System.out.println("Maior de idade");
   
        }else{
           System.out.println("Menor de idade"); 
        }
        
        int soma = 17;
        
        if(soma >= 18){
            System.out.println("Quero somar");
   
        }else{
           System.out.println("Quero subtrair"); 
        }
        
        int multiplicacao = 17;
        
        if(multiplicacao >= 18){
            System.out.println("Quero multiplicar");
   
        }else{
           System.out.println("Quero dividir"); 
        }
    }
    
    }

}

    

    
