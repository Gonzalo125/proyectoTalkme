package model.Entidades;

import java.sql.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Chat {

    private int id_chat;
    private String nombre_chat;
    private String archivo;
    private Date fecha_crecion_chat;
    private String imagen_chat;
    private int can_personas;

    /**
     * @return the id_chat
     */
    public int getId_chat() {
        return id_chat;
    }

    /**
     * @param id_chat the id_chat to set
     */
    public void setId_chat(int id_chat) {
        this.id_chat = id_chat;
    }

    /**
     * @return the nombre_chat
     */
    public String getNombre_chat() {
        return nombre_chat;
    }

    /**
     * @param nombre_chat the nombre_chat to set
     */
    public void setNombre_chat(String nombre_chat) {
        this.nombre_chat = nombre_chat;
    }

    /**
     * @return the archivo
     */
    public String getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the fecha_crecion_chat
     */
    public Date getFecha_crecion_chat() {
        return fecha_crecion_chat;
    }

    /**
     * @param fecha_crecion_chat the fecha_crecion_chat to set
     */
    public void setFecha_crecion_chat(Date fecha_crecion_chat) {
        this.fecha_crecion_chat = fecha_crecion_chat;
    }

    /**
     * @return the imagen_chat
     */
    public String getImagen_chat() {
        return imagen_chat;
    }

    /**
     * @param imagen_chat the imagen_chat to set
     */
    public void setImagen_chat(String imagen_chat) {
        this.imagen_chat = imagen_chat;
    }

    /**
     * @return the can_personas
     */
    public int getCan_personas() {
        return can_personas;
    }

    /**
     * @param can_personas the can_personas to set
     */
    public void setCan_personas(int can_personas) {
        this.can_personas = can_personas;
    }

   
}
