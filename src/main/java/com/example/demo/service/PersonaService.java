package com.example.demo.service;
import com.example.demo.entity.Persona;
import java.util.List;

public interface PersonaService  {
    List<Persona> consultarPersona();
    Persona CrearPersona(Persona persona);

    Persona ModificarPersona(Persona persona);

    Persona BuscarPersona(Integer id);

    void  EliminarPersona(int id);


}
