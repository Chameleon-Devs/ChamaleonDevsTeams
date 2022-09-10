package com.co.udea.mintic.chameleonApp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empresa")
    private Long empresaId;

    @Column(name = "nombre_empresa", unique = true)
    private String nombreEmpresa;

    @Column(name = "nit_empresa", unique = true)
    private String nitEmpresa;

    @Column(name = "telefono_empresa")
    private String telefonoEmpresa;

    @Column(name = "direccion_empresa")
    private String direccionEmpresa;

    @OneToMany (mappedBy = "empresa")
    private List<Empleado> empleado = new ArrayList<>();

    @OneToMany (mappedBy = "empresa")
    private List<MovimientoDinero> movimientoDinero = new ArrayList<>();

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, String nitEmpresa, String telefonoEmpresa, String direccionEmpresa, List<Empleado> empleado, List<MovimientoDinero> movimientoDinero, Date fechaCreacion, Date fechaActualizacion) {
        this.nombreEmpresa = nombreEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.empleado = empleado;
        this.movimientoDinero = movimientoDinero;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    public Long getEmpresaId() {
        return empresaId;
    }
    /*
        public void setEmpresaId(Long empresaId) {
            this.empresaId = empresaId;
        }

     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }

    public List<MovimientoDinero> getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(List<MovimientoDinero> movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
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

}
