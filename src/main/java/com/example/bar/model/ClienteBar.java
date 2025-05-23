package com.example.bar.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("cliente_bar")
public class ClienteBar {
    @Id
    private Long id;
    private String nombre;
    private String telefono;
    private TipoCliente tipoCliente;
    private String bebidaFavorita;

    public enum TipoCliente {
        ocacional,regular,vip
    }
}