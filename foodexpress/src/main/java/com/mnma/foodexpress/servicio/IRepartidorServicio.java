package com.mnma.foodexpress.servicio;

import java.util.List;

import com.mnma.foodexpress.modelo.entidad.Repartidor;

public interface IRepartidorServicio {
    public Repartidor insertarRepartidor(Repartidor repartidor);
    public Repartidor editarRepartidor(int idRepartidor);
    public void eliminarRepartidor(int idRepartidor);
    public List<Repartidor> listaRepartidores();
}