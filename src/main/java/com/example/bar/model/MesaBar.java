package com.example.bar.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("mesa_bar")
public class MesaBar {
    @Id
    private Long id;
    private int capacidad;
    private String ubicacion; // barra, terraza, vip, sofa
    private EstadoMesa estado;
    private TipoMesa tipo;

    public enum EstadoMesa {
        LIBRE, RESERVADA, OCUPADA
    }

    public enum TipoMesa {
        ALTA, BAJA, PRIVADA
    }
}