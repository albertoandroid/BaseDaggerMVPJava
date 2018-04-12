package com.androiddesdecero.a004daggerjava.model;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

/**
 * Created by albertopalomarrobledo on 12/4/18.
 */

public class Video implements Serializable {
    @Expose
    private String idvideo;

    @Expose
    private String codidioma;

    @Expose
    private String codmenu;

    @Expose
    private String urlyoutube;

    @Expose
    private String urlimage;

    @Expose
    private String idimagen;

    @Expose
    private String tiempo;

    @Expose
    private String titulo;

    @Expose
    private String texto;

    public String getIdvideo() {
        return idvideo;
    }

    public void setIdvideo(String idvideo) {
        this.idvideo = idvideo;
    }

    public String getCodidioma() {
        return codidioma;
    }

    public void setCodidioma(String codidioma) {
        this.codidioma = codidioma;
    }

    public String getCodmenu() {
        return codmenu;
    }

    public void setCodmenu(String codmenu) {
        this.codmenu = codmenu;
    }

    public String getUrlyoutube() {
        return urlyoutube;
    }

    public void setUrlyoutube(String urlyoutube) {
        this.urlyoutube = urlyoutube;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }

    public String getIdimagen (){return idimagen;}

    public void setIdimagen (String idimagen){
        this.idimagen = idimagen;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}

