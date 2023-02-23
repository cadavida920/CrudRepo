package com.example.demo.Repository;

import com.example.demo.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Persona, Integer> {


}
