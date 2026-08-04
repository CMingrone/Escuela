package com.carlos.documentacion.service;

import com.carlos.documentacion.entity.Alumno;
import com.carlos.documentacion.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }
    // Obtener todos los alumnos
    public List<Alumno> listarAlumnos() {
        return alumnoRepository.findAll();
    }

    // Buscar un alumno por ID
    public Alumno buscarPorId(Integer id) {
        return alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
    }

    // Guardar un alumno
    public Alumno guardar(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    // Eliminar un alumno
    public void eliminar(Integer id) {
        alumnoRepository.deleteById(id);
    }
}