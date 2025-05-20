package com.example.bar.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("pedido_bar")
public class PedidoBar {
    @Id
    private Long id;
    private String producto;
    private int cantidad;
    private int precioUnitario;
    private EstadoPedido estado;
    private Long mesaId; // FK a MesaBar

    public enum EstadoPedido {
        PENDIENTE, ENTREGADO, CANCELADO
    }
    // getters y setters

}
