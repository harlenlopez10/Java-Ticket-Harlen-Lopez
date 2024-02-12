/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javaticket_harlenlopez1;

import static Javaticket_harlenlopez1.Crear_Evento.eventos;
import static Javaticket_harlenlopez1.Login.usuarioLogin;
import static Javaticket_harlenlopez1.Reportes.jList1;
import static Javaticket_harlenlopez1.Reportes.modelo;
import static Javaticket_harlenlopez1.confirmar_evento.eventosCancelados;
import static Javaticket_harlenlopez1.Crear_Evento.user;
import static Javaticket_harlenlopez1.Reportes.fechaFinal;
import static Javaticket_harlenlopez1.Reportes.fechaInicial;
import static Javaticket_harlenlopez1.Reportes.montoTotal;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author adalb
 */
public class reportesClase extends reportesClaseAbstract {
    private Date hoy=new Date();
    public int cantiadadDeportivo,cantiadadMusical,cantiadadReligioso;
    public String estado;
    
    public final void listaDeEventosRealizados(int indice){
        if(indice<eventos.size()){
            if(eventos.get(indice)!=null){
                if(eventos.get(indice).getFecha().before(hoy)){
                    if(eventos.get(indice).getClase().equals("cancelado")){

                    }else{
                        if(eventos.get(indice).getClase().equals("Deportivo")){
                            cantiadadDeportivo++;
                        }else if(eventos.get(indice).getClase().equals("Musical")){
                            cantiadadMusical++;
                        }else if(eventos.get(indice).getClase().equals("Religioso")){
                            cantiadadReligioso++;
                        }
                        montoTotal=montoTotal+eventos.get(indice).getMonto();
                        modelo.addElement("Codigo: "+eventos.get(indice).getCodigo()+", Tipo: "+eventos.get(indice).getClase()+
                            ", Titulo: "+eventos.get(indice).getTitulo()+", Fecha: "+eventos.get(indice).getFecha()+
                            ", Monto: "+eventos.get(indice).getMonto()+", Descripcion: "+eventos.get(indice).getDescripcion());
                        jList1.setModel(modelo);
                    }
                }else{

                }
            }
            listaDeEventosRealizados(indice+1);
        }
    }
    
    public final void listaDeEventosFuturos(int indice){
        if(indice<eventos.size()){
            if(eventos.get(indice)!=null){
                if(eventos.get(indice).getFecha().before(hoy)){
                
                }else{
                    if(eventos.get(indice).getClase().equals("cancelado")){

                    }else{
                        if(eventos.get(indice).getClase().equals("Deportivo")){
                            cantiadadDeportivo++;
                        }else if(eventos.get(indice).getClase().equals("Musical")){
                            cantiadadMusical++;
                        }else if(eventos.get(indice).getClase().equals("Religioso")){
                            cantiadadReligioso++;
                        }
                        montoTotal=montoTotal+eventos.get(indice).getMonto();
                        modelo.addElement("Codigo: "+eventos.get(indice).getCodigo()+", Tipo: "+eventos.get(indice).getClase()+
                            ", Titulo: "+eventos.get(indice).getTitulo()+", Fecha: "+eventos.get(indice).getFecha()+
                            ", Monto: "+eventos.get(indice).getMonto()+", Descripcion: "+eventos.get(indice).getDescripcion());
                        jList1.setModel(modelo);
                    }
                }
            }
            listaDeEventosFuturos(indice+1);
        }
    }
    
    public final void listaDeEventosCancelados(int indice){
        if(indice<eventosCancelados.size()){
            if(eventosCancelados.get(indice)!=null){
                if(eventosCancelados.get(indice).getTitulo().equals("Deportivo")){
                    cantiadadDeportivo++;
                }else if(eventosCancelados.get(indice).getTitulo().equals("Musical")){
                    cantiadadMusical++;
                }else if(eventosCancelados.get(indice).getTitulo().equals("Religioso")){
                    cantiadadReligioso++;
                }
                modelo.addElement("Codigo: "+eventosCancelados.get(indice).getCodigo()+", Tipo: "+eventosCancelados.get(indice).getClase()+
                    ", Titulo: "+eventosCancelados.get(indice).getTitulo()+", Fecha: "+eventosCancelados.get(indice).getFecha()+
                    ", Monto: "+eventosCancelados.get(indice).getMonto()+", Descripcion: "+eventos.get(indice).getDescripcion());
                jList1.setModel(modelo);
            }
            listaDeEventosCancelados(indice+1);
        }
    }
    
    public final void verPerfilDeUsuario(int indice){
        if(indice<user.size()){
            if(user.get(indice)!=null){
                if(user.get(indice).equals(usuarioLogin)){
                    if(eventos.get(indice)!=null){
                        if(eventos.get(indice).getFecha().before(hoy)){
                            estado="Realizado";
                        }else{
                            estado="Futuro";
                        }
                        if(eventos.get(indice).getClase().equals("cancelado")){

                        }else{
                            modelo.addElement("Titulo: "+eventos.get(indice).getTitulo()+", Tipo: "+eventos.get(indice).getClase()+
                                    ", Estado: "+estado+", Monto:"+eventos.get(indice).getMonto());
                            jList1.setModel(modelo);
                        }
                    }
                }
            }
            verPerfilDeUsuario(indice+1);
        }
    }
    
    public final void ingresoGeneradoPorFecha(int indice){
        if(indice<eventos.size()){
            if(eventos.get(indice)!=null){
                if(fechaInicial.after(eventos.get(indice).getFecha())||fechaFinal.before(eventos.get(indice).getFecha())){

                }else{
                    if(eventos.get(indice).getClase().equals("cancelado")){
                        
                    }else{
                        if(eventos.get(indice).getClase().equals("Deportivo")){
                        cantiadadDeportivo++;
                        }else if(eventos.get(indice).getClase().equals("Musical")){
                            cantiadadMusical++;
                        }else if(eventos.get(indice).getClase().equals("Religioso")){
                            cantiadadReligioso++;
                        }
                        modelo.addElement("Codigo: "+eventos.get(indice).getCodigo()+", Tipo: "+eventos.get(indice).getClase()+
                            ", Titulo: "+eventos.get(indice).getTitulo()+", Fecha: "+eventos.get(indice).getFecha()+
                            ", Monto: "+eventos.get(indice).getMonto()+", Descripcion: "+eventos.get(indice).getDescripcion());
                        jList1.setModel(modelo);
                    }
                    montoTotal=montoTotal+eventos.get(indice).getMonto();
                }
            }
            ingresoGeneradoPorFecha(indice+1);
        }
    }
}
