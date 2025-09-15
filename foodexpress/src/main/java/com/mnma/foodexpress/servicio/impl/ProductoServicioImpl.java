package com.mnma.foodexpress.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mnma.foodexpress.modelo.entidad.Producto;
import com.mnma.foodexpress.repositorio.IProductoRepositorio;
import com.mnma.foodexpress.servicio.IProductoServicio;

@Service
@Component
public class ProductoServicioImpl implements IProductoServicio {

    @Autowired
    private IProductoRepositorio repositorio;
    
    @Override
    public Producto insertarProducto(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public Producto editarProducto(int idProducto) {
        return repositorio.findById(idProducto).get();
    }

    @Override
    public void eliminarProducto(int idProducto) {
        repositorio.delete(editarProducto(idProducto));
    }

    @Override
    public List<Producto> listaProductos() {
        return repositorio.findAll();
    }
}