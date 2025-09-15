package com.mnma.foodexpress.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mnma.foodexpress.modelo.entidad.Cliente;

@Repository
@Component
public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {

}