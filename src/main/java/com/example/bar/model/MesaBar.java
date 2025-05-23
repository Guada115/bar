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
    private TipoMesa tipo;  // alta, baja, privada

    public enum EstadoMesa {
        libre,reservada,ocupada
    }

    public enum TipoMesa {
        alta,baja,privada
    }
    public enum UbicacionMesa {
        barra,terraza,vip,sofa
    }

    // getters y setters


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public EstadoMesa getEstado() {
        return estado;
    }
    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }
    public TipoMesa getTipo() {
        return tipo;
    }
    public void setTipo(TipoMesa tipo) {
        this.tipo = tipo;
    }

}