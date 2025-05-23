package com.example.bar.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("horario_bar")
public class HorarioBar {
    @Id
    private Long id;
    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private DiaSemana dia;
    private boolean horaFeliz;
    private Long mesaId;

    public enum DiaSemana {
        jueves,viernes,sabado,domingo
    }
}
