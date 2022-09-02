package com.co.udea.mintic.ChameleonApp.Entities;

import javax.persistence.*;
import java.awt.*;
import java.util.Date;

@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "imagen")
    private image imagen;//revisar tipo de dato binario
    @Column(name = "teléfono")
    private String telefono;
    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    private Date fechaActualizacion;

    public Perfil() {

    }

    public Perfil(Image imagen, String telefono, Empleado empleado, Date fechaCreacion, Date fechaActualizacion) {
        this.imagen = imagen;
        this.telefono = telefono;
        this.empleado = empleado;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


}
