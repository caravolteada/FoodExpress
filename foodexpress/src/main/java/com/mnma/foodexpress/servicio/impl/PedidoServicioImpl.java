package com.mnma.foodexpress.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mnma.foodexpress.modelo.entidad.Pedido;
import com.mnma.foodexpress.repositorio.IPedidoRepositorio;
import com.mnma.foodexpress.servicio.IPedidoServicio;

@Service
@Component
public class PedidoServicioImpl implements IPedidoServicio {

    @Autowired
    private IPedidoRepositorio repositorio;
    
    @Override
    public Pedido insertarPedido(Pedido pedido) {
        return repositorio.save(pedido);
    }

    @Override
    public Pedido editarPedido(int idPedido) {
        return repositorio.findById(idPedido).get();
    }

    @Override
    public void eliminarPedido(int idPedido) {
        repositorio.delete(editarPedido(idPedido));
    }

    @Override
    public List<Pedido> listaPedidos() {
        return repositorio.findAll();
    }
}