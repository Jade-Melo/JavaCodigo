/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

/**
 *
 * @author JADE_4567
 */
public class Testar {
    public static void main(String[] args) {
        
        Calculadora x = new Calculadora();
        
        
        x.multiplicao();
        
        int escolha =1;
        
        if(escolha == 1){
            x.somar();
        }else if(escolha == 2){
        }
        
        x.somar();
        
        int res =1;
        
        if(res == 1) {
            x.subtracao();
        }else if(res == 2){
        }
        
        x.subtracao();
        
        int opcao =1;
        
        if(opcao == 1){
            x.divisao();
        }else if(opcao == 2){
        }
      
    }
}
