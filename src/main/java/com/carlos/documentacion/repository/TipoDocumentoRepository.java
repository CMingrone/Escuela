package com.carlos.documentacion.repository;

import com.carlos.documentacion.entity.Persona;
import com.carlos.documentacion.entity.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer> {

}