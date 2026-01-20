package com.letrana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letrana.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
