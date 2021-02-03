package com.saludo.tareaandroidsemana4.pojo;

public class Mascota {
    private String nombre;
    private int mascota;
    private int like;

    public Mascota(String nombre, int mascota, int like) {
        this.nombre = nombre;
        this.mascota = mascota;
        this.like = like;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMascota() {
        return mascota;
    }

    public void setMascota(int mascota) {
        this.mascota = mascota;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
