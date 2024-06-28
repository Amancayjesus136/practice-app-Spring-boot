package com.test.appweb.service;

import com.test.appweb.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerTodas();

    Persona ObtererPorId(Long id);

    Persona crearPersona(Persona persona);

    Persona actualizarPersona(Long id, Persona persona);

    void eliminarPersona(Long id);

    long contarPersonas();
}
