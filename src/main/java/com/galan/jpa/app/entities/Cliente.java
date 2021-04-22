package com.galan.jpa.app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private Integer edad;

    @Column(name = "fecha_contratacion")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Integer edad, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
