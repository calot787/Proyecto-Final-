package com.letrana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letrana.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario,Long> {

}
