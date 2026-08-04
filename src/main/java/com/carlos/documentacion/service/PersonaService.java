package com.carlos.documentacion.service;

import com.carlos.documentacion.entity.Persona;
import com.carlos.documentacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    // Obtener todas las personas
    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    // Buscar una persona por ID
    public Persona buscarPorId(Integer id) {
        return personaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Persona no encontrado"));
    }

    // Guardar una persona
    public Persona guardar(Persona persona) {
        return personaRepository.save(persona);
    }

    // Eliminar una persona
    public void eliminar(Integer id) {
        personaRepository.deleteById(id);
    }
}