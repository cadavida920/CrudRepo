package com.example.demo.service.PersonaserviceIMPL;
import com.example.demo.Repository.PersonaRepo;
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;


@Service
public class PSIMPL implements PersonaService {

    @Autowired
    private PersonaRepo repo;

    @Override
    public List<Persona> consultarPersona() {
        return (List<Persona>) this.repo.findAll();
    }
    @Override
    public Persona CrearPersona(Persona persona) {
        if (Objects.nonNull(persona.getId())) {
            throw new IllegalArgumentException("Id no es permitido en la creacion");
        }

        return this.repo.save(persona);
    }
    @Override
    public Persona ModificarPersona(Persona persona) {
        //no crear usuarios
        if (Objects.isNull(persona.getId())) {
            throw new IllegalArgumentException("Id no es permitido crear usuarios en modificacion");
        }

        Optional<Persona> personaOptional = this.repo.findById(persona.getId());

        if (personaOptional.isEmpty()) {
            throw new IllegalArgumentException("Id no existe en la bd");
        }


        return this.repo.save(persona);
    }
    @Override
    public Persona BuscarPersona(Integer id){
        return this.repo.findById(id).orElseThrow(() -> new IllegalArgumentException("id no encontrado"));
    }
    @Override
    public void EliminarPersona(int id) {
        this.repo.deleteById(id);

    }

}


