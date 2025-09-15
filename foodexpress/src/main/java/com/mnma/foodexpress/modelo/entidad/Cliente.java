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
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
    
    private String nombreCliente;
    private String emailCliente;
    private String telefonoCliente;
    private String direccionCliente;
    
    @ToString.Exclude
    @OneToMany(mappedBy = "cliente", 
               cascade = CascadeType.REFRESH)
    @JsonBackReference
    private List<Pedido> listaPedidos = new ArrayList<>();
}