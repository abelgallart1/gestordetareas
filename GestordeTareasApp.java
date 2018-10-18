
import java.awt.Color;
import java.awt.FileDialog;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import loquendo.tts.engine.TTSException;
import loquendo.tts.engine.TTSReader;
import loquendo.tts.engine.TTSSession;

public class GestordeTareasApp extends javax.swing.JFrame {
    /**
     * Creates new form GestordeTareasApp
     */
    
    CalendarioEfemerides CE;
    ArrayList tareas=new ArrayList();
    Timer boca,timer;
    TimerTask  habla,actualiza;
    
    public TTSSession hSession = null; 
        
    public TTSReader hReader = null;
   
    
    public GestordeTareasApp() {
        initComponents();
        
        setLocationRelativeTo(null);
  
         try { hSession = new TTSSession();
               hReader = new TTSReader(hSession);
	       hReader.setAudio("LTTS7AudioBoard", null, 32000, "linear", 2);
	       hReader.loadPersona("Carmen",null,null);
		
              } catch (Exception e) {e.printStackTrace();} 

        
        
        CE=new CalendarioEfemerides();
      
      
        try{            
                         String name="C:/tareas";
                          ObjectInputStream op=new ObjectInputStream( new FileInputStream(name));
                          tareas=(ArrayList)op.readObject();
                         }catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"No se encuentra el archivo tareas"
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);  }    
                 
                
      
        jPanel1.add(CE,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0, 450, 450));
        jPanel1.repaint();
        jPanel1.validate();
        
        nunca.setSelected(true);
       
        timer=new Timer();
        boca=new Timer();
           
        actualiza=new TimerTask() {public void run() {actualizaTareas();}};
        habla=new TimerTask() {public void run() {habla();}};
        
        actualizaTareas();
            
        timer.scheduleAtFixedRate(actualiza,0,10000);
        boca.scheduleAtFixedRate(habla,0,5000);
        
        
        
    }

   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        min = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        seg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel6 = new javax.swing.JLabel();
        nunca = new javax.swing.JRadioButton();
        siempre = new javax.swing.JRadioButton();
        semanal = new javax.swing.JRadioButton();
        mensual = new javax.swing.JRadioButton();
        anual = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 680));
        setPreferredSize(new java.awt.Dimension(960, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(450, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 450, 450));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 50, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 190, -1));

        jLabel2.setText("Hora:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 20));

        hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaActionPerformed(evt);
            }
        });
        jPanel2.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 30, 30));

        jLabel3.setText(" Min:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 20));

        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        jPanel2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 30));

        jLabel4.setText("Seg:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 20));
        jPanel2.add(seg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));

        jLabel5.setText("Descripción:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 20));

        jScrollPane1.setViewportView(jEditorPane1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 460, 140));

        jLabel6.setText("Repetir:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 60, 20));

        nunca.setText("Nunca");
        nunca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuncaActionPerformed(evt);
            }
        });
        jPanel2.add(nunca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        siempre.setText("Siempre");
        siempre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siempreActionPerformed(evt);
            }
        });
        jPanel2.add(siempre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        semanal.setText("Semanal");
        semanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semanalActionPerformed(evt);
            }
        });
        jPanel2.add(semanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        mensual.setText("Mensual");
        mensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensualActionPerformed(evt);
            }
        });
        jPanel2.add(mensual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        anual.setText("Anual");
        anual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anualActionPerformed(evt);
            }
        });
        jPanel2.add(anual, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jButton1.setText("Guardar Tarea");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jButton2.setText("Borrar Tarea");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 270));

        jScrollPane3.setPreferredSize(new java.awt.Dimension(500, 610));

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane3.setViewportView(jPanel5);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 470, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int posicion=0;
    void habla(){                          try{ ArrayList tareasdeldia=new ArrayList();
                               Calendar hoy=Calendar.getInstance();
                              int hora=hoy.get(Calendar.HOUR_OF_DAY);
                              int min=hoy.get(Calendar.MINUTE);
                              int seg=hoy.get(Calendar.SECOND);
                             
                              if (CE.getEfemeride()!=null)
                              {   Efemeride ef=CE.getEfemeride();
                              
                                  Calendar ca=Calendar.getInstance();
                                  ca.set(Calendar.HOUR_OF_DAY,7);
                                  ca.set(Calendar.MINUTE, 45);
                                  ca.set(Calendar.SECOND,0);
                                  ca.set(Calendar.YEAR,hoy.get(Calendar.YEAR));
                                  Tarea t=new Tarea("efemeride",ca,ef.efem); 
                                  tareasdeldia.add(t);
                              }
                                         
                                   
                          
                               for(int i=0;i<tareas.size();i++)
                                {Tarea aux=(Tarea)tareas.get(i);
                                
                                if (aux.dia.get(Calendar.YEAR)==Integer.parseInt(CE.getCalendario().jTextField1.getText())&&
                                    aux.dia.get(Calendar.MONTH)==Integer.parseInt(CE.getCalendario().jTextField2.getText())-1&&
                                    aux.dia.get(Calendar.DAY_OF_MONTH)==Integer.parseInt(CE.getCalendario().label2.getText())
                                    ) { if (!tareasdeldia.contains(aux)) tareasdeldia.add(aux);
                                         }
                                                        
                                } 

                                                        
                             
                              for(int i=0;i<tareasdeldia.size();i++)
                                  
                              { Tarea t1=(Tarea)tareasdeldia.get(i);
                                posicion=jScrollPane3.getVerticalScrollBar().getValue();
                                if (t1.dia.get(Calendar.HOUR_OF_DAY)==hora
                                        &&
                                    t1.dia.get(Calendar.MINUTE)==min
                                        &&
                                    Math.abs(t1.dia.get(Calendar.SECOND)-seg )<10   
                                        ){
                                      posicion=i*(jScrollPane3.getVerticalScrollBar().getMaximum()/tareasdeldia.size()); 
                                     jScrollPane3.getVerticalScrollBar().setValue(posicion);
                                      jScrollPane3.repaint();
                                       String h=hora+":"+min+":"+"\n";
                                      String aux=h;
                                       aux+="Es la hora de"+"\n";
                                      aux+=t1.nombre+"\n";
                                      aux+=t1.Descripcion+"\n";
                                      System.out.println(aux);
                                      hReader.read(aux, false, false);
                                      
                                      java.awt.Component []comp=jPanel5.getComponents();
                                      
                                      for(int p=0;p<comp.length;p++)
                                      {  Tarea t=((TareaPanel)comp[p]).tarea;
                                        if (t.equals(t1)) ((TareaPanel)comp[p]).setBackground(Color.red);
                                        else ((TareaPanel)comp[p]).setBackground(Color.white);
                                                                            
                                      }
                                
                                
                                        }                             
                              }
                          }catch(Exception e){e.printStackTrace();}
    }
    
void actualizaTareas(){
                          
                          try{ ArrayList tareasdeldia=new ArrayList();
                               Calendar hoy=Calendar.getInstance();
                              int hora=hoy.get(Calendar.HOUR_OF_DAY);
                              int min=hoy.get(Calendar.MINUTE);
                              int seg=hoy.get(Calendar.SECOND);
                             
                              if (CE.getEfemeride()!=null)
                              {   Efemeride ef=CE.getEfemeride();
                              
                                  Calendar ca=Calendar.getInstance();
                                  ca.set(Calendar.HOUR_OF_DAY,7);
                                  ca.set(Calendar.MINUTE, 45);
                                  ca.set(Calendar.SECOND,0);
                                  ca.set(Calendar.YEAR,hoy.get(Calendar.YEAR));
                                  Tarea t=new Tarea("efemeride",ca,ef.efem); 
                                  tareasdeldia.add(t);
                              }
                                         
                                   
                          
                               for(int i=0;i<tareas.size();i++)
                                {Tarea aux=(Tarea)tareas.get(i);
                                
                                if (aux.dia.get(Calendar.YEAR)==Integer.parseInt(CE.getCalendario().jTextField1.getText())&&
                                    aux.dia.get(Calendar.MONTH)==Integer.parseInt(CE.getCalendario().jTextField2.getText())-1&&
                                    aux.dia.get(Calendar.DAY_OF_MONTH)==Integer.parseInt(CE.getCalendario().label2.getText())
                                    ) { if (!tareasdeldia.contains(aux)) tareasdeldia.add(aux);
                                         }
                                                        
                                } 

                               Object[]ob=tareasdeldia.toArray();
                               Arrays.sort(ob);
                               tareasdeldia=new ArrayList();
                               for(int i=0;i<ob.length;i++) tareasdeldia.add(ob[i]);
                               
                               
                              jPanel5.setLayout(new java.awt.GridLayout(tareasdeldia.size(), 1));
                              jPanel5.removeAll();
                              jPanel5.setSize(440,120*tareasdeldia.size());
                              
                              for(int i=0;i<tareasdeldia.size();i++)
                               { Tarea t1=(Tarea)tareasdeldia.get(i);
                                 TareaPanel tp=new TareaPanel(t1,this);
                                 
                                if (t1.dia.get(Calendar.HOUR_OF_DAY)==hora
                                        &&
                                    t1.dia.get(Calendar.MINUTE)==min
                                        &&
                                    Math.abs(t1.dia.get(Calendar.SECOND)-seg )<10   
                                        )  tp.setBackground(Color.red);
                                
                                jPanel5.add(tp);
                               
                               }
                              jScrollPane3.getVerticalScrollBar().setValue(posicion);
                              jScrollPane3.repaint();
                              
                              
                          }catch(Exception e){e.printStackTrace();}

}    
    
    
    private void horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void nuncaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuncaActionPerformed
    nunca.setSelected(true);
    siempre.setSelected(false);
    semanal.setSelected(false);
    mensual.setSelected(false);
    anual.setSelected(false);
        
    // TODO add your handling code here:
    }//GEN-LAST:event_nuncaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int hra=0,minuto=0,segundo=0;
      
       try{ hra=Integer.parseInt(hora.getText());
             if (hra<0||hra>23) throw new Exception();
           }
       catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de la hora incorrecto"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                          }
       try{ minuto=Integer.parseInt(min.getText());
             if (minuto<0||minuto>59) throw new Exception();
           }
       catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de los minutos incorrecto"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                          }
       try{ segundo=Integer.parseInt(seg.getText());
             if (segundo<0||segundo>59) throw new Exception();
           }
       catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de de los segundos incorrecto"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                            }
       
      int año=1900,mes=1,dia=1; 
      
     try{
      año=Integer.parseInt(CE.getCalendario().jTextField1.getText());
      mes=Integer.parseInt(CE.getCalendario().jTextField2.getText())-1;
      dia=Integer.parseInt(CE.getCalendario().label2.getText());
     }catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de de la Fecha"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                         
                           }

      if (nunca.isSelected()){
                                Calendar aux=Calendar.getInstance();
                                aux.set(año, mes, dia, hra, minuto, segundo);
     
                                Tarea tarea=new Tarea(jTextField1.getText(),aux,jEditorPane1.getText());
     
                                tareas.add(tarea);
                              }
      
      else if (siempre.isSelected()){
                                
                                for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if ( aux.get(Calendar.YEAR)==año)                                 
                                           { Calendar x=Calendar.getInstance();
                                             x.set(Calendar.YEAR,año);
                                             x.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                             x.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                             x.set(Calendar.HOUR_OF_DAY,hra);
                                             x.set(Calendar.MINUTE,minuto);
                                             x.set(Calendar.SECOND,segundo);
                                                                          
                                            Tarea tarea=new Tarea(jTextField1.getText(),x,jEditorPane1.getText());
                                            tareas.add(tarea);
                                          }
                                }
                              }
      else if (semanal.isSelected()){ Calendar x=Calendar.getInstance();
                                      x.set(año,mes, dia, hra, minuto, segundo);
                                             
                                                               
                                for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if (aux.get(Calendar.YEAR)==año&&
                                     aux.get(Calendar.DAY_OF_WEEK)==x.get(Calendar.DAY_OF_WEEK))    
    
                                           { Calendar y=Calendar.getInstance();
                                      
                                             y.set(Calendar.YEAR,año);
                                             y.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                             y.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                             y.set(Calendar.HOUR_OF_DAY,hra);
                                             y.set(Calendar.MINUTE,minuto);
                                             y.set(Calendar.SECOND,segundo);
                                                                                                                  
                                            Tarea tarea=new Tarea(jTextField1.getText(),y,jEditorPane1.getText());
                                            tareas.add(tarea);
                                             
                                           }
                                } 
                             }
      
      else if (mensual.isSelected()){
                                
                                for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if (aux.get(Calendar.DAY_OF_MONTH)==dia    
                                         &&
                                     aux.get(Calendar.YEAR)==año)    

                                                 { Calendar x=Calendar.getInstance();
                                                   x.set(Calendar.YEAR,año);
                                                   x.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                                   x.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                                   x.set(Calendar.HOUR_OF_DAY,hra);
                                                   x.set(Calendar.MINUTE,minuto);
                                                   x.set(Calendar.SECOND,segundo);
                                             
                                                    Tarea tarea=new Tarea(jTextField1.getText(),x,jEditorPane1.getText());
     
                                                     tareas.add(tarea);
                                                   }
                                }
                              }
      
      
      else if (anual.isSelected()) {
          
                                 for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if (aux.get(Calendar.DAY_OF_MONTH)==dia&&
                                     aux.get(Calendar.MONTH)==mes)                    
                                          { Calendar x=Calendar.getInstance();
                                             x.set(Calendar.YEAR,año);
                                             x.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                             x.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                             x.set(Calendar.HOUR_OF_DAY,hra);
                                             x.set(Calendar.MINUTE,minuto);
                                             x.set(Calendar.SECOND,segundo);
                                              Tarea tarea=new Tarea(jTextField1.getText(),x,jEditorPane1.getText());
     
                                                    tareas.add(tarea);
                                                   }
                                }
                              }
      
     try{
           String name="C:/tareas";
           ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream(name));
              op.writeObject(tareas);
            }catch(Exception e){e.printStackTrace();
                               
                                javax.swing.JOptionPane.showMessageDialog
                                (null,"No se pudo guardar los cambios"
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);      }
           
      
    actualizaTareas();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    private void siempreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siempreActionPerformed
    nunca.setSelected(false);
    siempre.setSelected(true);
    semanal.setSelected(false);
    mensual.setSelected(false);
    anual.setSelected(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_siempreActionPerformed

    private void semanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semanalActionPerformed
    nunca.setSelected(false);
    siempre.setSelected(false);
    semanal.setSelected(true);
    mensual.setSelected(false);
    anual.setSelected(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_semanalActionPerformed

    private void mensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensualActionPerformed
    nunca.setSelected(false);
    siempre.setSelected(false);
    semanal.setSelected(false);
    mensual.setSelected(true);
    anual.setSelected(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_mensualActionPerformed

    private void anualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anualActionPerformed
    nunca.setSelected(false);
    siempre.setSelected(false);
    semanal.setSelected(false);
    mensual.setSelected(false);
    anual.setSelected(true);
            // TODO add your handling code here:
    }//GEN-LAST:event_anualActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     ArrayList copia=new ArrayList();
        for(int i=0;i<tareas.size();i++)
            copia.add(((Tarea)tareas.get(i)).clone());
        
     int hra=0,minuto=0,segundo=0;
      
       try{ hra=Integer.parseInt(hora.getText());
             if (hra<0||hra>23) throw new Exception();
           }
       catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de la hora incorrecto"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                          }
       try{ minuto=Integer.parseInt(min.getText());
             if (minuto<0||minuto>59) throw new Exception();
           }
       catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de los minutos incorrecto"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                          }
       try{ segundo=Integer.parseInt(seg.getText());
             if (segundo<0||segundo>59) throw new Exception();
           }
       catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de de los segundos incorrecto"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                            }
           
     int año=1900,mes=1,dia=1; 
          
    for(int j=0;j<tareas.size();j++)
    {Tarea Taux=(Tarea)tareas.get(j);
    if (Taux.nombre.equals(jTextField1.getText())&&
        Taux.Descripcion.equals(jEditorPane1.getText()) )
        
    { try{
      año=Integer.parseInt(CE.getCalendario().jTextField1.getText());
      mes=Integer.parseInt(CE.getCalendario().jTextField2.getText())-1;
      dia=Integer.parseInt(CE.getCalendario().label2.getText());
     }catch(Exception e){javax.swing.JOptionPane.showMessageDialog
                                (null,"formato de de la Fecha"
                                        ,"No se pudo guardar la tarea",javax.swing.JOptionPane.OK_OPTION);    
       
                         return;
                         
                           }

      if (nunca.isSelected()){
                                Calendar aux=Calendar.getInstance();
                                aux.set(año, mes, dia, hra, minuto, segundo);
     
                                Tarea tarea=new Tarea(jTextField1.getText(),aux,jEditorPane1.getText());
     
                                copia.remove(tarea);
                              }
      
      else if (siempre.isSelected()){
                                
                                for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if ( aux.get(Calendar.YEAR)==año)                                 
                                           { Calendar x=Calendar.getInstance();
                                             x.set(Calendar.YEAR,año);
                                             x.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                             x.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                             x.set(Calendar.HOUR_OF_DAY,hra);
                                             x.set(Calendar.MINUTE,minuto);
                                             x.set(Calendar.SECOND,segundo);
                                                                          
                                            Tarea tarea=new Tarea(jTextField1.getText(),x,jEditorPane1.getText());
                                            copia.remove(tarea);
                                          }
                                }
                              }
      else if (semanal.isSelected()){ Calendar x=Calendar.getInstance();
                                      x.set(año,mes, dia, hra, minuto, segundo);
                                             
                                                               
                                for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if (aux.get(Calendar.YEAR)==año&&
                                     aux.get(Calendar.DAY_OF_WEEK)==x.get(Calendar.DAY_OF_WEEK))    
    
                                           { Calendar y=Calendar.getInstance();
                                      
                                             y.set(Calendar.YEAR,año);
                                             y.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                             y.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                             y.set(Calendar.HOUR_OF_DAY,hra);
                                             y.set(Calendar.MINUTE,minuto);
                                             y.set(Calendar.SECOND,segundo);
                                                                                                                  
                                            Tarea tarea=new Tarea(jTextField1.getText(),y,jEditorPane1.getText());
                                            copia.remove(tarea);
                                             
                                           }
                                } 
                             }
      
      else if (mensual.isSelected()){
                                
                                for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if (aux.get(Calendar.DAY_OF_MONTH)==dia    
                                         &&
                                     aux.get(Calendar.YEAR)==año)    

                                                 { Calendar x=Calendar.getInstance();
                                                   x.set(Calendar.YEAR,año);
                                                   x.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                                   x.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                                   x.set(Calendar.HOUR_OF_DAY,hra);
                                                   x.set(Calendar.MINUTE,minuto);
                                                   x.set(Calendar.SECOND,segundo);
                                             
                                                    Tarea tarea=new Tarea(jTextField1.getText(),x,jEditorPane1.getText());
     
                                                     copia.remove(tarea);
                                                   }
                                }
                              }
      
      
      else if (anual.isSelected()) {
          
                                 for(int i=0;i<CE.getCalendario().dias.size();i++)
                                {Calendar aux=(Calendar)CE.getCalendario().dias.get(i);
                                  
                                 if (aux.get(Calendar.DAY_OF_MONTH)==dia&&
                                     aux.get(Calendar.MONTH)==mes)                    
                                          { Calendar x=Calendar.getInstance();
                                             x.set(Calendar.YEAR,año);
                                             x.set(Calendar.MONTH,aux.get(Calendar.MONTH));
                                             x.set(Calendar.DAY_OF_MONTH,aux.get(Calendar.DAY_OF_MONTH));
                                             
                                             x.set(Calendar.HOUR_OF_DAY,hra);
                                             x.set(Calendar.MINUTE,minuto);
                                             x.set(Calendar.SECOND,segundo);
                                              Tarea tarea=new Tarea(jTextField1.getText(),x,jEditorPane1.getText());
     
                                                    copia.remove(tarea);
                                                   }
                                }
                              }
    
    
    
    
    }
        
        
        
       
       
    } 
    
    tareas=copia;
   
    try{
            String name="C:/tareas";
           ObjectOutputStream op=new ObjectOutputStream(new FileOutputStream(name));
              op.writeObject(tareas);
            }catch(Exception e){e.printStackTrace();
                               
                                javax.swing.JOptionPane.showMessageDialog
                                (null,"No se pudo guardar los cambios"
                                        ,"Error",javax.swing.JOptionPane.OK_OPTION);      }
         


   actualizaTareas();
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestordeTareasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestordeTareasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestordeTareasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestordeTareasApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestordeTareasApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton anual;
    public javax.swing.JTextField hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton mensual;
    public javax.swing.JTextField min;
    private javax.swing.JRadioButton nunca;
    public javax.swing.JTextField seg;
    private javax.swing.JRadioButton semanal;
    private javax.swing.JRadioButton siempre;
    // End of variables declaration//GEN-END:variables

}
