package com.example.sqlitepractica.entidades;

public class Usuario {

    private Integer integerId;
    private String stringNombre;
    private String stringTelefono;

    public Usuario(Integer integerId, String stringNombre, String stringTelefono) {
        this.integerId = integerId;
        this.stringNombre = stringNombre;
        this.stringTelefono = stringTelefono;
    }

    public Integer getIntegerId() {
        return integerId;
    }

    public void setIntegerId(Integer integerId) {
        this.integerId = integerId;
    }

    public String getStringNombre() {
        return stringNombre;
    }

    public void setStringNombre(String stringNombre) {
        this.stringNombre = stringNombre;
    }

    public String getStringTelefono() {
        return stringTelefono;
    }

    public void setStringTelefono(String stringTelefono) {
        this.stringTelefono = stringTelefono;
    }

}
