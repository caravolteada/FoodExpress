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

import com.mnma.foodexpress.modelo.entidad.Cliente;
import com.mnma.foodexpress.servicio.IClienteServicio;

@RestController
@RequestMapping("api/clientes")
public class ClienteControlador {
    
    @Autowired
    private IClienteServicio servicio;
    
    @GetMapping
    public List<Cliente> listarClientes(){
        return servicio.listaClientes();
    }
    
    @PostMapping
    public Cliente insertarCliente(@RequestBody Cliente cliente) {
        return servicio.insertarCliente(cliente);
    }
    
    @GetMapping("/{id}")
    public Cliente editarCliente(@PathVariable("id") int id) {
        return servicio.editarCliente(id);
    }
    
    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable int id) {
        servicio.eliminarCliente(id);
    }
}