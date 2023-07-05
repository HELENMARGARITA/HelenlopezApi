package com.desarrolloWeb.helenLopezApiRest.persistencia.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarios_id")
    private Long usuariosId;

    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "email")
    private String email;

    @Column(name = "genero")
    private char genero;

    @Column(name = "password")
    private String password;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    // Getters and Setters

    public Long getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Long usuariosId) {
        this.usuariosId = usuariosId;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
