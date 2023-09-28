/*
 *CLASE EQUIPO PARA LLEVAR EL REGISTRO E INFORMACIÓN DE LOS EQUIPOS
 */
package proyecto1_floricela_arguedas;

/**
 *
 * @author Flory
 */
public class Equipo {
    /* DECLARACIONES */
    int id_equipo;
    String nombre_equipo;
    int posicion;
    int year_fundacion;
    
    
    /*METODO CONSTRUCTOR*/

    public Equipo(int id_equipo, String nombre_equipo, int posicion, int year_fundacion) {
        this.id_equipo = id_equipo;
        this.nombre_equipo = nombre_equipo;
        this.posicion = posicion;
        this.year_fundacion = year_fundacion;
    }
  
   
    /*GETTERS*/

    public int getId_equipo() {
        return id_equipo;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getAño_fundacion() {
        return year_fundacion;
    }
 
        /*SETTERS*/

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setAño_fundacion(int año_fundacion) {
        this.year_fundacion = año_fundacion;
    }
    
    
    
}
