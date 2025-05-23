package com.example.bar.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HorarioBar {
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
