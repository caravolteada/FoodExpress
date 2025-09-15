package com.mnma.foodexpress.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mnma.foodexpress.modelo.entidad.Cliente;
import com.mnma.foodexpress.repositorio.IClienteRepositorio;
import com.mnma.foodexpress.servicio.IClienteServicio;

@Service
@Component
public class ClienteServicioImpl implements IClienteServicio {

    @Autowired
    private IClienteRepositorio repositorio;
    
    @Override
    public Cliente insertarCliente(Cliente cliente) {
        return repositorio.save(cliente);
    }

    @Override
    public Cliente editarCliente(int idCliente) {
        return repositorio.findById(idCliente).get();
    }

    @Override
    public void eliminarCliente(int idCliente) {
        repositorio.delete(editarCliente(idCliente));
    }

    @Override
    public List<Cliente> listaClientes() {
        return repositorio.findAll();
    }
}