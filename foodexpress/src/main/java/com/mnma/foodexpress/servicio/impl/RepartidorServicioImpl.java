package com.mnma.foodexpress.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mnma.foodexpress.modelo.entidad.Repartidor;
import com.mnma.foodexpress.repositorio.IRepartidorRepositorio;
import com.mnma.foodexpress.servicio.IRepartidorServicio;

@Service
@Component
public class RepartidorServicioImpl implements IRepartidorServicio {

    @Autowired
    private IRepartidorRepositorio repositorio;
    
    @Override
    public Repartidor insertarRepartidor(Repartidor repartidor) {
        return repositorio.save(repartidor);
    }

    @Override
    public Repartidor editarRepartidor(int idRepartidor) {
        return repositorio.findById(idRepartidor).get();
    }

    @Override
    public void eliminarRepartidor(int idRepartidor) {
        repositorio.delete(editarRepartidor(idRepartidor));
    }

    @Override
    public List<Repartidor> listaRepartidores() {
        return repositorio.findAll();
    }
}
