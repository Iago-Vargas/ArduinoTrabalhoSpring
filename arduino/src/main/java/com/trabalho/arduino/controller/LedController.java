package com.trabalho.arduino.controller;

import com.trabalho.arduino.model.ComandosLed;
import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/led")
public class LedController {

    private final ComandosLed comandos;

    public LedController(ComandosLed comandos) {
        this.comandos = comandos;
    }

    @GetMapping("/ligar")
    public String ligar() {
        comandos.ligar();
        return "LED ligado!";
    }

    @GetMapping("/desligar")
    public String desligar() {
        comandos.desligar();
        return "LED desligado!";
    }
}

