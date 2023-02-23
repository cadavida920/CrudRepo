package com.example.demo.controller;

import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaserviceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("crudRepo")
public class Controlador {

    @Autowired
    private PSIMPL imple;

    @GetMapping
    @RequestMapping(value = "ConsultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> consultaPersonas() {
        List<Persona> Listarpersona = this.imple.consultarPersona();
        return ResponseEntity.ok(Listarpersona);
    }

    @PostMapping
    @RequestMapping(value = "CrearPersona", method = RequestMethod.POST)
    public ResponseEntity<?> crearPersona(@RequestBody Persona persona) {
        Persona PersonaCreada = this.imple.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPersonas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersonas(@RequestBody Persona persona) {
        Persona PersonaModificada = this.imple.ModificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable Integer id) {
        this.imple.BuscarPersona(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersona(@PathVariable int id) {
        this.imple.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }
}
