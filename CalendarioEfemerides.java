


import java.awt.FileDialog;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel
 */
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

public class CalendarioEfemerides extends javax.swing.JPanel {

    /**
     * Creates new form CalendarioApp
     */
     Timer tiempo=new Timer();
     TimerTask tiempoTarea;
     ArrayList  efemerides;
                 
     Calendario1 c;
             
     public Calendario getCalendario(){return c;}
    
     public Efemeride getEfemeride(){
         
         for(int i=0;i<efemerides.size();i++)
                {Efemeride e=(Efemeride)efemerides.get(i);
                   if (Integer.parseInt(c.jTextField2.getText())==e.mes&&
                     Integer.parseInt(c.label2.getText())==e.dia)    
                { if (e.efem.equals(""))return null;
                  else  return e;}
                                        
       
                }
         
         return null;
     }
     
     public CalendarioEfemerides() {
        initComponents();
                       
        c=new Calendario1();
           
        
        efemerides=new ArrayList();
        
        add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,90, 450,380));
        validate();
        repaint();
        this.setSize(460,300+90);
         try{          
              String name="C:/efemeride";
              ObjectInputStream op=new ObjectInputStream(new FileInputStream(name));
              efemerides=(ArrayList)op.readObject();
            }catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"No se encuentra el archivo efemeride"
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);      
                               
            
            efemerides.add(new Efemeride(1,1," Año nuevo"));
efemerides.add(new Efemeride(1,1," Dia de la Sagrada Familia"));
efemerides.add(new Efemeride(1,4," Dia del Braille"));
efemerides.add(new Efemeride(1,6," Dia de Reyes y Epifania del Señor"));
efemerides.add(new Efemeride(1,19," Dia Mundial de la Nieve"));
efemerides.add(new Efemeride(1,22," Dia del Community Manager"));
efemerides.add(new Efemeride(2,4," Dia Mundial contra el Cancer"));
efemerides.add(new Efemeride(2,10," Dia del Internet seguro"));
efemerides.add(new Efemeride(2,13," Martes de Carnaval y Dia Mundial de la Radio"));
efemerides.add(new Efemeride(2,14," San Valentin o Dia de los Enamorados y Dia de los amantes de la biblioteca"));
efemerides.add(new Efemeride(2,28," Dia de Andalucia"));
efemerides.add(new Efemeride(3,1," Dia de Baleares"));
efemerides.add(new Efemeride(3,3," Dia Mundial de la naturaleza"));
efemerides.add(new Efemeride(3,4,"ñ Premios Oscar"));
efemerides.add(new Efemeride(3,8," Dia de la Mujer"));
efemerides.add(new Efemeride(3,17," Saint Patrickñs Day"));
efemerides.add(new Efemeride(3,19," Dia del Padre y San Jose"));
efemerides.add(new Efemeride(3,20," Dia de la felicidad"));
efemerides.add(new Efemeride(3,21," Dia mundial de la poesia, Dia mundial del sindrome de down y Dia internacional de los bosques"));
efemerides.add(new Efemeride(3,22," Dia mundial del agua"));
efemerides.add(new Efemeride(3,25," Comienzo de la semana santa"));
efemerides.add(new Efemeride(3,31," Fin de la semana santa"));
efemerides.add(new Efemeride(4,6," Dia internacional del deporte"));
efemerides.add(new Efemeride(4,7," Dia mundial de la salud"));
efemerides.add(new Efemeride(4,10," Dia de los primos"));
efemerides.add(new Efemeride(4,13," Dia del beso"));
efemerides.add(new Efemeride(4,15," Dia del Niño"));
efemerides.add(new Efemeride(4,19," Dia mundial de la bicicleta"));
efemerides.add(new Efemeride(4,22," Dia de la tierra"));
efemerides.add(new Efemeride(4,23," Sant Jordi: Dia Internacional del Libro y la Rosa"));
efemerides.add(new Efemeride(4,27," Dia mundial del diseño grafico"));
efemerides.add(new Efemeride(4,28," Dia de la seguridad y salud"));
efemerides.add(new Efemeride(4,30," Dia internacional del jazz"));
efemerides.add(new Efemeride(5,1," Dia internacional del trabajador"));
efemerides.add(new Efemeride(5,3," Dia de la libertad de prensa"));
efemerides.add(new Efemeride(5,6," Dia de la Madre (primer domingo de 5)"));
efemerides.add(new Efemeride(5,12," Festival de Eurovision"));
efemerides.add(new Efemeride(5,15," Dia internacional de la familia"));
efemerides.add(new Efemeride(5,17," Dia internacional de internet"));
efemerides.add(new Efemeride(5,20," Domingo de Pentecostes"));
efemerides.add(new Efemeride(5,25," Dia del Orgullo Friki"));
efemerides.add(new Efemeride(5,26," Final de la Champions League"));
efemerides.add(new Efemeride(5,30," Dia de Canarias"));
efemerides.add(new Efemeride(5,31," Dia mundial sin tabaco y Dia de Castilla La Mancha"));
efemerides.add(new Efemeride(6,5," Dia mundial del medio ambiente"));
efemerides.add(new Efemeride(6,8," Dia mundial de los oceanos"));
efemerides.add(new Efemeride(6,12," Dia mundo contra el trabajo infantil"));
efemerides.add(new Efemeride(6,14," Inicio del Mundial de Futbol de la FIFA 2018 en Rusia y Dia mundial del donante de sangre"));
efemerides.add(new Efemeride(6,21,"ñ Dia internacional del yoga"));
efemerides.add(new Efemeride(6,26," Dia mundial contra la droga"));
efemerides.add(new Efemeride(6,28," Dia Internacional del Orgullo Gay (LGBT)"));
efemerides.add(new Efemeride(6,30," Social Media Day"));
efemerides.add(new Efemeride(7,17," Dia mundial del emoji"));
efemerides.add(new Efemeride(7,18," Dia internacional de Nelson Mandela"));
efemerides.add(new Efemeride(7,21," Dia mundial del perro"));
efemerides.add(new Efemeride(7,25," Santiago Apostol y Dia de Galicia"));
efemerides.add(new Efemeride(7,27," Dia Internacional del Perro Callejero"));
efemerides.add(new Efemeride(7,30," dia internacional de la amistad"));
efemerides.add(new Efemeride(8,3," Dia Mundial de la Cerveza"));
efemerides.add(new Efemeride(8,8," Dia internacional del gato"));
efemerides.add(new Efemeride(8,9," Dia de los amantes de los libros"));
efemerides.add(new Efemeride(8,12," Dia internacional de la juventud"));
efemerides.add(new Efemeride(8,15," La Asuncion de la Virgen"));
efemerides.add(new Efemeride(8,19," Dia mundial de la fotografia y Dia de la asistencia humanitaria"));
efemerides.add(new Efemeride(8,29," Dia Internacional del Gamer"));
efemerides.add(new Efemeride(8,31," Dia internacional de la solidaridad"));
efemerides.add(new Efemeride(9,6," Dia de leer un libro"));
efemerides.add(new Efemeride(9,8," Dia internacional de la alfabetizacion,ñ Dia Internacional del Periodista y Dia de Asturias"));
efemerides.add(new Efemeride(9,13," Dia de pensar en positivo"));
efemerides.add(new Efemeride(9,15," Dia Mundial de las Playas (tercera semana) y Dia internacional de la democracia"));
efemerides.add(new Efemeride(9,16," Dia de la preservacion de la capa de ozono"));
efemerides.add(new Efemeride(9,21," Dia internacional de la paz y Dia mundial del Alzheimer"));
efemerides.add(new Efemeride(9,22," Inicio de la Oktoberfest"));
efemerides.add(new Efemeride(9,27," Dia mundial del turismo"));
efemerides.add(new Efemeride(9,29," Dia mundial del corazon"));
efemerides.add(new Efemeride(10,1," Dia internacional de la musica"));
efemerides.add(new Efemeride(10,2," Dia internacional de no violencia"));
efemerides.add(new Efemeride(10,4," Dia mundial de los animales"));
efemerides.add(new Efemeride(10,5," Dia mundial de los docentes"));
efemerides.add(new Efemeride(10,12," Dia de la Hispanidad"));
efemerides.add(new Efemeride(10,16," Dia mundial de la alimentacion"));
efemerides.add(new Efemeride(10,19," Dia internacional del cancer de mama"));
efemerides.add(new Efemeride(10,24," Dia de las Naciones Unidas"));
efemerides.add(new Efemeride(10,31," Halloween"));
efemerides.add(new Efemeride(11,1," Dia de Todos los Santos"));
efemerides.add(new Efemeride(11,3," Dia mundial de la usabilidad"));
efemerides.add(new Efemeride(11,10," Dia mundial de la ciencia"));
efemerides.add(new Efemeride(11,11," Dia mundial de la diabetes, Dia del Origami y Dia del Abrazo en Familia (segundo domingo)"));
efemerides.add(new Efemeride(11,16," Dia mundial de la tolerancia"));
efemerides.add(new Efemeride(11,19," Dia del hombre"));
efemerides.add(new Efemeride(11,20," Dia mundial de la infancia"));
efemerides.add(new Efemeride(11,21," Dia mundial de la television"));
efemerides.add(new Efemeride(11,23," Black Friday"));
efemerides.add(new Efemeride(12,1," Dia mundial contra el VIH/SIDA"));
efemerides.add(new Efemeride(12,3," Dia de las personas con discapacidad"));
efemerides.add(new Efemeride(12,6," Dia de la Constitucion Española"));
efemerides.add(new Efemeride(12,8," La Inmaculada Concepcion"));
efemerides.add(new Efemeride(12,10," Dia de los derechos humanos"));
efemerides.add(new Efemeride(12,24," Noche Buena"));
efemerides.add(new Efemeride(12,25," Dia de Navidad"));
efemerides.add(new Efemeride(12,28," Dia de los inocentes"));
efemerides.add(new Efemeride(12,31," Fin de Año"));

            
            }
     
       /*  for(int i=0;i<efemerides.size();i++)
         {Efemeride ef=(Efemeride)efemerides.get(i);
      
           System.out.println("efemerides.add(new Efemeride("+ef.mes+","+ef.dia+","+'"'+ef.efem+'"'+"));");
         
         
         }*/
       
                  
         
         tiempoTarea=new TimerTask() {
         
            public void run() {
              boolean encontrado=false;
             for(int i=0;i<efemerides.size();i++)
                {Efemeride e=(Efemeride)efemerides.get(i);
                   if (Integer.parseInt(c.jTextField2.getText())==e.mes&&
                     Integer.parseInt(c.label2.getText())==e.dia)    
                {jEditorPane1.setText(e.efem);encontrado=true;}
                                        
                }
            if(!encontrado) jEditorPane1.setText("");
                 
            }
        };
                
        tiempo.scheduleAtFixedRate(tiempoTarea, 0,500);
        
    
    
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setMinimumSize(new java.awt.Dimension(450, 90));
        setPreferredSize(new java.awt.Dimension(400, 90));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEditorPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jEditorPane1MousePressed(evt);
            }
        });
        jEditorPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jEditorPane1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jEditorPane1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        
    }// </editor-fold>                        

    private void jEditorPane1MousePressed(java.awt.event.MouseEvent evt) {                                          
     if (tiempoTarea!=null){tiempoTarea.cancel();tiempoTarea=null;}
     if (tiempo!=null) {tiempo.cancel();tiempo=null;}
    
// TODO add your handling code here:
    }                                         

    private void jEditorPane1KeyPressed(java.awt.event.KeyEvent evt) {                                        
     if (tiempoTarea!=null){tiempoTarea.cancel();tiempoTarea=null;}
     if (tiempo!=null) {tiempo.cancel();tiempo=null;}
    
        // TODO add your handling code here:
    }                                       

   
    // Variables declaration - do not modify                     
    public  javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   



         class  Calendario1 extends Calendario{
      
          void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
           super.jButton2ActionPerformed(evt);
      
           boolean encontrado=false;
           Calendar aux=Calendar.getInstance();
           int hora=aux.get(Calendar.HOUR_OF_DAY);
           int min=aux.get(Calendar.MINUTE);
              int segundos=aux.get(Calendar.SECOND);
                    
           for(int i=0;i<efemerides.size();i++)
                {Efemeride e=(Efemeride)efemerides.get(i);
                   if (Integer.parseInt(jTextField2.getText())==e.mes&&
                     Integer.parseInt(label2.getText())==e.dia)    
                   {if (hora!=0||min!=0||segundos!=0)  e.efem=jEditorPane1.getText();
                    else jEditorPane1.setText(e.efem);
                   
                      
                   
                   
                   encontrado=true;}
                }     
           
           if (!encontrado) 
               
               if (hora!=0||min!=0||segundos!=0)                      
               efemerides.add(new Efemeride(Integer.parseInt(jTextField2.getText()),
                                                         Integer.parseInt(label2.getText()),
                                                         jEditorPane1.getText()));
           
               
           
            try{
              String name="C:/efemeride";
              ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream(name));
              op.writeObject(efemerides);
            }catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"No se pudo guardar los cambios"
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);      }
                  
            
            if (tiempoTarea!=null){tiempoTarea.cancel();tiempoTarea=null;}
            if (tiempo!=null) {tiempo.cancel();tiempo=null;}
        
          
            tiempoTarea=new TimerTask() {
         
            public void run() {
              boolean encontrado=false;
             for(int i=0;i<efemerides.size();i++)
                {Efemeride e=(Efemeride)efemerides.get(i);
                   if (Integer.parseInt(jTextField2.getText())==e.mes&&
                     Integer.parseInt(label2.getText())==e.dia)    
                {jEditorPane1.setText(e.efem);encontrado=true;}
                                        
                }
            if(!encontrado) jEditorPane1.setText("");
                 
            }
             };
        tiempo=new Timer();        
        tiempo.scheduleAtFixedRate(tiempoTarea, 0,500);
               
          
          }
         
        }    
    
        




}

