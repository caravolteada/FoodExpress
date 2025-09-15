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

import com.mnma.foodexpress.modelo.entidad.Repartidor;
import com.mnma.foodexpress.servicio.IRepartidorServicio;

@RestController
@RequestMapping("api/repartidores")
public class RepartidorControlador {
    
    @Autowired
    private IRepartidorServicio servicio;
    
    @GetMapping
    public List<Repartidor> listarRepartidores(){
        return servicio.listaRepartidores();
    }
    
    @PostMapping
    public Repartidor insertarRepartidor(@RequestBody Repartidor repartidor) {
        return servicio.insertarRepartidor(repartidor);
    }
    
    @GetMapping("/{id}")
    public Repartidor editarRepartidor(@PathVariable("id") int id) {
        return servicio.editarRepartidor(id);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarRepartidor(@PathVariable int id) {
        servicio.eliminarRepartidor(id);
    }
}