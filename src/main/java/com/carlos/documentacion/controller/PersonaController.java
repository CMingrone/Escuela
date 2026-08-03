package com.carlos.documentacion.controller;

import com.carlos.documentacion.entity.Persona;
import com.carlos.documentacion.service.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    // Obtener todas las personas
    @GetMapping
    public List<Persona> listarPersonas() {
        return personaService.listarPersonas();
    }

    // Buscar una persona por ID
    @GetMapping("/{id}")
    public Optional<Persona> buscarPorId(@PathVariable Integer id) {
        return personaService.buscarPorId(id);
    }

    // Crear una persona
    @PostMapping
    public Persona guardar(@RequestBody Persona persona) {
        return personaService.guardar(persona);
    }

    // Eliminar una persona
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        personaService.eliminar(id);
    }
}