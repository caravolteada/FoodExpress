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

import com.mnma.foodexpress.modelo.entidad.Pago;
import com.mnma.foodexpress.servicio.IPagoServicio;

@RestController
@RequestMapping("api/pagos")
public class PagoControlador {
    
    @Autowired
    private IPagoServicio servicio;
    
    @GetMapping
    public List<Pago> listarPagos(){
        return servicio.listaPagos();
    }
    
    @PostMapping
    public Pago insertarPago(@RequestBody Pago pago) {
        return servicio.insertarPago(pago);
    }
    
    @GetMapping("/{id}")
    public Pago editarPago(@PathVariable("id") int id) {
        return servicio.editarPago(id);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable int id) {
        servicio.eliminarPago(id);
    }
}