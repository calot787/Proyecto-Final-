package com.letrana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letrana.model.Libro;


public interface LibroRepository extends JpaRepository<Libro,Long> {

}
