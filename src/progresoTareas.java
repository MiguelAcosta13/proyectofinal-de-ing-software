
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
public class progresoTareas {
    String proyecto;
    String tarea;
    String participante;
    String estadotarea;
    Date fecha;

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getEstadotarea() {
        return estadotarea;
    }

    public void setEstadotarea(String estadotarea) {
        this.estadotarea = estadotarea;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public progresoTareas(String proyecto, String tarea, String participante, String estadotarea, Date fecha) {
        this.proyecto = proyecto;
        this.tarea = tarea;
        this.participante = participante;
        this.estadotarea = estadotarea;
        this.fecha = fecha;
    }
    
}
