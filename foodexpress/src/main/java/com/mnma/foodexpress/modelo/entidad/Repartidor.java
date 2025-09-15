package com.mnma.foodexpress.modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
public class Repartidor implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRepartidor;
    
    private String nombreRepartidor;
    private String telefonoRepartidor;
    private String zona_asignadaRepartidor;
    
    @ToString.Exclude
    @OneToMany(mappedBy = "repartidor", 
               cascade = CascadeType.REFRESH)
    @JsonBackReference
    private List<Pedido> listaPedidos = new ArrayList<>();
}
