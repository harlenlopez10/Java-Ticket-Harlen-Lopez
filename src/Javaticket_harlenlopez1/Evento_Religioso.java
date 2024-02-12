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
public class Evento_Religioso extends Evento {
    
    public static final double MONTO=2000;
    
    public Evento_Religioso(String codigo, String clase, String titulo, String descripcion, Date fecha, double monto, int cantidad) {
        super(codigo, clase, titulo, descripcion, fecha, MONTO, cantidad);
    }
}
