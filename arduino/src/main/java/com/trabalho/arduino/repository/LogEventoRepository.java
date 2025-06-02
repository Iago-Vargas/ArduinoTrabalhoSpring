package com.trabalho.arduino.repository;

import com.trabalho.arduino.model.LogEvento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEventoRepository extends JpaRepository<LogEvento, Long> {
}
