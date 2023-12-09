import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class regisTarea {
    String proyecto;
    String participante;
    String nombreTarea;
    String objetivo;
    Date fechaInicio;
    Date fechatermino;
    String prioridad;

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechatermino() {
        return fechatermino;
    }

    public void setFechatermino(Date fechatermino) {
        this.fechatermino = fechatermino;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public regisTarea(String proyecto, String participante, String nombreTarea, String objetivo, Date fechaInicio, Date fechatermino, String prioridad) {
        this.proyecto = proyecto;
        this.participante = participante;
        this.nombreTarea = nombreTarea;
        this.objetivo = objetivo;
        this.fechaInicio = fechaInicio;
        this.fechatermino = fechatermino;
        this.prioridad = prioridad;
    }
    
}
