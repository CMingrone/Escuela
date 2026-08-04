package com.carlos.documentacion.controller;

import com.carlos.documentacion.entity.Alumno;
import com.carlos.documentacion.service.AlumnoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    // Obtener todas los alumnos
    @GetMapping
    public List<Alumno> listarAlumnos() {
        return alumnoService.listarAlumnos();
    }

    // Buscar un alumno por ID
    @GetMapping("/{id}")
    public ResponseEntity<Alumno> buscarPorId(@PathVariable Integer id) {

        Alumno alumno = alumnoService.buscarPorId(id);

        return ResponseEntity.ok(alumno);
    }

    // Crear un alumno
    @PostMapping
    public Alumno guardar(@RequestBody Alumno alumno) {
        return alumnoService.guardar(alumno);
    }

    // Eliminar un alumno
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        alumnoService.eliminar(id);
    }
}