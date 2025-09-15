package com.mnma.foodexpress.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mnma.foodexpress.modelo.entidad.Pago;
import com.mnma.foodexpress.repositorio.IPagoRepositorio;
import com.mnma.foodexpress.servicio.IPagoServicio;

@Service
@Component
public class PagoServicioImpl implements IPagoServicio {

    @Autowired
    private IPagoRepositorio repositorio;
    
    @Override
    public Pago insertarPago(Pago pago) {
        return repositorio.save(pago);
    }

    @Override
    public Pago editarPago(int idPago) {
        return repositorio.findById(idPago).get();
    }

    @Override
    public void eliminarPago(int idPago) {
        repositorio.delete(editarPago(idPago));
    }

    @Override
    public List<Pago> listaPagos() {
        return repositorio.findAll();
    }
}
