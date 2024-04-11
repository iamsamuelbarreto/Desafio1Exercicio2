package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Esse programa mostra o dia com base no numero inserido");
        int diaDaSemana = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero do dia:"));

        switch(diaDaSemana) {
            case DiasDaSemana.DOMINGO:
                JOptionPane.showMessageDialog(null,"O dia é: Domingo");
                break;
            case DiasDaSemana.SEGUNDA:
                JOptionPane.showMessageDialog(null,"O dia é: Segunda-Feira");
                break;
            case DiasDaSemana.TERÇA:
                JOptionPane.showMessageDialog(null,"O dia é: Terça-Feira");
                break;
            case DiasDaSemana.QUARTA:
                JOptionPane.showMessageDialog(null,"O dia é: Quarta-feira");
                break;
            case DiasDaSemana.QUINTA:
                JOptionPane.showMessageDialog(null,"O dia é: Quinta-Feira");
                break;
            case DiasDaSemana.SEXTA:
                JOptionPane.showMessageDialog(null,"O dia é: Sexta-Feira");
                break;
            case DiasDaSemana.SABADO:
                JOptionPane.showMessageDialog(null,"O dia é: Sabado");
                break;
            default:
                JOptionPane.showMessageDialog(null,"O dia é: Invalido");
                break;
        }
    }
}