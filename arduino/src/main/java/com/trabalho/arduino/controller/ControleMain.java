package com.trabalho.arduino.controller;

public class ControleMain {
    public static void main(String[] args) {
        ControlePorta controle = new ControlePorta("COM5", 9600); // Substitua "COM3" pela sua porta COM

        // Enviar dados
        controle.enviaDados("1"); // Liga o LED
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        controle.enviaDados("2"); // Desliga o LED

        // Fechar a porta
        controle.close();
    }
}
