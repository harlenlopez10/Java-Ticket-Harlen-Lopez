/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaticket_harlenlopez1;

import java.util.Date;


/**
 *
 * @author adalb
 */
public class Evento_Deportivo extends Evento {
    
    public String equipo1;
    public String equipo2;
    public String tipo;
    
    public Evento_Deportivo(String codigo, String clase, String titulo, String descripcion, Date fecha, double monto, int cantidad, 
            String equipo1, String equipo2, String tipo) {
        super(codigo, clase, titulo, descripcion, fecha, monto, cantidad);
        this.equipo1=equipo1;
        this.equipo2=equipo2;
        this.tipo=tipo;
    }
    
    public String getEquipo1(){
        return equipo1;
    }
    
    public String getEquipo2(){
        return equipo2;
    }
    
    public String getTipo(){
        return tipo;
    }
    
}
