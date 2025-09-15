package com.mnma.foodexpress.servicio;

import java.util.List;

import com.mnma.foodexpress.modelo.entidad.Pago;

public interface IPagoServicio {
    public Pago insertarPago(Pago pago);
    public Pago editarPago(int idPago);
    public void eliminarPago(int idPago);
    public List<Pago> listaPagos();
}