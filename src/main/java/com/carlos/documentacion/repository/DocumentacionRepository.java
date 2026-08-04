package com.carlos.documentacion.repository;

import com.carlos.documentacion.entity.Documentacion;
import com.carlos.documentacion.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentacionRepository extends JpaRepository<Documentacion, Integer> {

}