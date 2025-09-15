package com.mnma.foodexpress.servicio;

import java.util.List;

import com.mnma.foodexpress.modelo.entidad.Pedido;

public interface IPedidoServicio {
    public Pedido insertarPedido(Pedido pedido);
    public Pedido editarPedido(int idPedido);
    public void eliminarPedido(int idPedido);
    public List<Pedido> listaPedidos();
}