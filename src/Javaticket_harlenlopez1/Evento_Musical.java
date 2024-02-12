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
public class Evento_Musical extends Evento {
    
    public String tipo;
    
    public Evento_Musical(String codigo, String clase, String titulo, String descripcion, Date fecha, double monto, int cantidad, String tipo) {
        super(codigo, clase, titulo, descripcion, fecha, monto, cantidad);
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
}
