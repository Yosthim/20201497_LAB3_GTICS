package com.example.lab3_20201497.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer edad;
    private String genero;
    private String diagnostico;
    private Date fecha_cita;
    private Integer numero_habitacion;
    private Integer oftalmologo_id;
    private Integer clinica_id;

}
