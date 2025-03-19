/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio;

import javax.swing.JOptionPane;


public class CaixadeDialogo {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        
        JOptionPane.showMessageDialog(null, nome + "Sua idade é: " + idade);
    }   
}
