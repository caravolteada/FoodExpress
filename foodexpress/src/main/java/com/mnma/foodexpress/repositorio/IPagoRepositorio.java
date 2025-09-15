package com.mnma.foodexpress.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mnma.foodexpress.modelo.entidad.Pago;

@Repository
@Component
public interface IPagoRepositorio extends JpaRepository<Pago, Integer> {

}