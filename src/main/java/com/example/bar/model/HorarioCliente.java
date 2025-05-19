package com.example.bar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor // Esta anotación es crucial
public class HorarioCliente {
    private Long id;
    private Long horarioId;
    private Long clienteId;
}