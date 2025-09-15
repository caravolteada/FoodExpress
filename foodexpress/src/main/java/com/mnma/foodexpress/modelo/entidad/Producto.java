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
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    
    private String nombreProducto;
    private double precioProducto;
    private int stockProducto;
    
    @ToString.Exclude
    @OneToMany(mappedBy = "producto", 
               cascade = CascadeType.REFRESH)
    @JsonBackReference
    private List<Pedido> listaPedidos = new ArrayList<>();
}