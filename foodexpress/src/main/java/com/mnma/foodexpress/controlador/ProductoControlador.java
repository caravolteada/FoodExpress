package com.mnma.foodexpress.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mnma.foodexpress.modelo.entidad.Producto;
import com.mnma.foodexpress.servicio.IProductoServicio;

@RestController
@RequestMapping("api/productos")
public class ProductoControlador {
    
    @Autowired
    private IProductoServicio servicio;
    
    @GetMapping
    public List<Producto> listarProductos(){
        return servicio.listaProductos();
    }
    
    @PostMapping
    public Producto insertarProducto(@RequestBody Producto producto) {
        return servicio.insertarProducto(producto);
    }
    
    @GetMapping("/{id}")
    public Producto editarProducto(@PathVariable("id") int id) {
        return servicio.editarProducto(id);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id) {
        servicio.eliminarProducto(id);
    }
}