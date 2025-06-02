package com.trabalho.arduino.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LogEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acao;

    private LocalDateTime horario;

    public LogEvento() {}

    public LogEvento(String acao, LocalDateTime horario) {
        this.acao = acao;
        this.horario = horario;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public String getAcao() { return acao; }
    public void setAcao(String acao) { this.acao = acao; }
    public LocalDateTime getHorario() { return horario; }
    public void setHorario(LocalDateTime horario) { this.horario = horario; }
}

