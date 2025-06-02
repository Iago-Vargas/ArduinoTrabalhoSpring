package com.trabalho.arduino.model;

import com.trabalho.arduino.controller.ControlePorta;
import com.trabalho.arduino.repository.LogEventoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ComandosLed {

    private final ControlePorta porta = new ControlePorta("COM5", 9600);
    private final LogEventoRepository repo;

    public ComandosLed(LogEventoRepository repo) {
        this.repo = repo;
    }

    public void ligar() {
        porta.enviaDados("1");
        repo.save(new LogEvento("LIGAR", LocalDateTime.now()));
    }

    public void desligar() {
        porta.enviaDados("2");
        repo.save(new LogEvento("DESLIGAR", LocalDateTime.now()));
    }

    public void fechar() {
        porta.close();
    }
}
