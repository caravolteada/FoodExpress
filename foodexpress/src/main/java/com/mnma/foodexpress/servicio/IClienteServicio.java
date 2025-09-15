package com.mnma.foodexpress.servicio;

import java.util.List;

import com.mnma.foodexpress.modelo.entidad.Cliente;

public interface IClienteServicio {
    public Cliente insertarCliente(Cliente cliente);
    public Cliente editarCliente(int idCliente);
    public void eliminarCliente(int idCliente);
    public List<Cliente> listaClientes();
}