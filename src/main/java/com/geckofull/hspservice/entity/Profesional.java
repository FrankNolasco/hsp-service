package com.geckofull.hspservice.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "profesional", uniqueConstraints = {
        @UniqueConstraint(columnNames = "numero_documento")
})
public class Profesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "codigo_unico", nullable = false)
    private Integer codigoUnico;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(name = "tipo_documento", nullable = false, length = 50)
    private String tipoDocumento;

    @Column(name = "numero_documento", nullable = false, length = 20, unique = true)
    private String numeroDocumento;

    @Column(name = "colegio_profesional", length = 255)
    private String colegioProfesional;

    @Column(name = "numero_colegiatura", length = 50)
    private String numeroColegiatura;

    @Column(nullable = false, length = 255)
    private String apellidos;

    @Column(nullable = false, length = 255)
    private String nombres;

    @Column(length = 255)
    private String especialidad;

    @Column(length = 255)
    private String servicio;

}
