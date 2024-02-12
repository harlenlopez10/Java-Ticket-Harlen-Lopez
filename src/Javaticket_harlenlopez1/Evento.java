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
public class Evento {
    private String codigo;
    private String titulo;
    private String descripcion;
    private Date fecha;
    private int cantidad;
    private String clase;
    private double monto;
    
    public Evento(String codigo, String clase, String titulo, String descripcion, Date fecha, double monto, int cantidad) {
        this.codigo=codigo;
        this.clase=clase;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.monto=monto;
        this.cantidad=cantidad;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getClase(){
        return clase;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    
    
    /*
    if(indice<2){
        if(indice<2){
            modelo.addElement("jgvhbjhgfbkjhg");
            jList1.setModel(modelo);
            lista(indice+1);
        }else{

        }
    }
    */
}
