package com.mnma.foodexpress.servicio;

import java.util.List;

import com.mnma.foodexpress.modelo.entidad.Producto;

public interface IProductoServicio {
    public Producto insertarProducto(Producto producto);
    public Producto editarProducto(int idProducto);
    public void eliminarProducto(int idProducto);
    public List<Producto> listaProductos();
}