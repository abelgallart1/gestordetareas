/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import java.io.Serializable;

public class Tarea implements Serializable,Comparable{

    /**
     * Creates new form Tarea
     */
    
    String nombre,Descripcion;
    Calendar dia;
    
    public int compareTo(Object  x)
    { Tarea  aux=(Tarea)x;
     if (dia.get(Calendar.HOUR_OF_DAY)>aux.dia.get(Calendar.HOUR_OF_DAY)) return 1;
     else if (dia.get(Calendar.HOUR_OF_DAY)<aux.dia.get(Calendar.HOUR_OF_DAY)) return -1;
     else if (dia.get(Calendar.MINUTE)>aux.dia.get(Calendar.MINUTE)) return 1;
     else if (dia.get(Calendar.MINUTE)<aux.dia.get(Calendar.MINUTE)) return -1;
     else if (dia.get(Calendar.SECOND)>aux.dia.get(Calendar.SECOND)) return 1;
     else if (dia.get(Calendar.SECOND)<aux.dia.get(Calendar.SECOND)) return -1;
     else return 0;
    }
    
    public Object clone(){
    return new Tarea(nombre,(Calendar)dia.clone(),Descripcion);
    }

   public boolean equals(Object x){
    if (!(x instanceof Tarea)) return false;
       Tarea aux=(Tarea)x;
    return (nombre.equals(aux.nombre)&&Descripcion.equals(aux.Descripcion)&&
            dia.get(Calendar.HOUR_OF_DAY)==aux.dia.get(Calendar.HOUR_OF_DAY)&&
            dia.get(Calendar.MINUTE)==aux.dia.get(Calendar.MINUTE)&&
            dia.get(Calendar.SECOND)==aux.dia.get(Calendar.SECOND)&&
            dia.get(Calendar.DAY_OF_MONTH)==aux.dia.get(Calendar.DAY_OF_MONTH)&&
            dia.get(Calendar.MONTH)==aux.dia.get(Calendar.MONTH)&&
            dia.get(Calendar.YEAR)==aux.dia.get(Calendar.YEAR)); 
  } 
    public Tarea(String nombre,Calendar dia,String Descripcion) {
    this.nombre=nombre;
    this.dia=dia;
    this.Descripcion=Descripcion;
     }



}
