package com.trabalho.arduino.controller;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JOptionPane;

public class ControlePorta {
    private OutputStream serialOut;
    private int taxa;
    private String portaCOM;

    /**
     * Construtor da classe ControlePorta
     * @param portaCOM - Porta COM que será utilizada para enviar os dados para o arduino
     * @param taxa - Taxa de transferência da porta serial geralmente é 9600
     */
    public ControlePorta(String portaCOM, int taxa) {
        this.portaCOM = portaCOM;
        this.taxa = taxa;
        this.initialize();
    }

    /**
     * Método que verifica se a comunicação com a porta serial está ok
     */
    private void initialize() {
        try {
            // Define uma variável portId do tipo CommPortIdentifier para realizar a comunicação serial
            CommPortIdentifier portId = null;
            try {
                // Tenta verificar se a porta COM informada existe
                portId = CommPortIdentifier.getPortIdentifier(this.portaCOM);
            } catch (NoSuchPortException npe) {
                // Caso a porta COM não exista, será exibido um erro
                System.out.println("Não foi possível enviar o dado.");

                return;
            }
            // Abre a porta COM
            SerialPort port = (SerialPort) portId.open("Comunicação serial", this.taxa);
            serialOut = port.getOutputStream();
            port.setSerialPortParams(this.taxa, // taxa de transferência da porta serial
                    SerialPort.DATABITS_8, // taxa de 10 bits 8 (envio)
                    SerialPort.STOPBITS_1, // taxa de 10 bits 1 (recebimento)
                    SerialPort.PARITY_NONE); // receber e enviar dados
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que fecha a comunicação com a porta serial
     */
    public void close() {
        try {
            serialOut.close();
        } catch (IOException e) {
            System.out.println("Não foi possível enviar o dado.");
        }
    }

    /**
     * @param opcao - Valor a ser enviado pela porta serial
     */
    public void enviaDados(String opcao) {
        try {
            serialOut.write(opcao.getBytes()); // envia como sequência de bytes (ex: '1')
        } catch (IOException ex) {
            System.out.println("Não foi possível enviar o dado.");
        }
    }

}