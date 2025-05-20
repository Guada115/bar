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
        LIBRE, RESERVADA, OCUPADA
    }

    public enum TipoMesa {
        ALTA, BAJA, PRIVADA
    }
    public enum UbicacionMesa {
        BARRA, TERRAZA, VIP, SOFA
    }

    // getters y setters

    public Integer getId(){
        return id.intValue();
    }
    public void setId(Integer id){
        this.id = Long.valueOf(id);
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