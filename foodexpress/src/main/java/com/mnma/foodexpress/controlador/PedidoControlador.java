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

import com.mnma.foodexpress.modelo.entidad.Pedido;
import com.mnma.foodexpress.servicio.IPedidoServicio;

@RestController
@RequestMapping("api/pedidos")
public class PedidoControlador {
    
    @Autowired
    private IPedidoServicio servicio;
    
    @GetMapping
    public List<Pedido> listarPedidos(){
        return servicio.listaPedidos();
    }
    
    @PostMapping
    public Pedido insertarPedido(@RequestBody Pedido pedido) {
        return servicio.insertarPedido(pedido);
    }
    
    @GetMapping("/{id}")
    public Pedido editarPedido(@PathVariable("id") int id) {
        return servicio.editarPedido(id);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable int id) {
        servicio.eliminarPedido(id);
    }
}