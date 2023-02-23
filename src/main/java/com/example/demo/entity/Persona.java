package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;
    @Column(name = "nombres")
    private String nombre;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "email")
    private String email;


    // Agregamos get and set
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}