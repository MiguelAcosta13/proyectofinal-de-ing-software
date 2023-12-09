
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
public class regisProyecto {
    String nombreProyecto;
    String objetivo;
    Date fechaInicio;
    Date fechatermino;
    String prioridad;

    public regisProyecto(String nombreProyecto, String objetivo, Date fechaInicio, Date fechatermino, String prioridad) {
        this.nombreProyecto = nombreProyecto;
        this.objetivo = objetivo;
        this.fechaInicio = fechaInicio;
        this.fechatermino = fechatermino;
        this.prioridad = prioridad;
    }

    regisProyecto(String proyecto, String participante, String nombreTarea, String objetivo, Date valueOf, Date valueOf0, String prioridad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyect) {
        this.nombreProyecto = nombreProyect;
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

    public void setFechatermino(Date fechadtermino) {
        this.fechatermino = fechadtermino;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
          
    
}
