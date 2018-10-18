/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abel
 */
import java.awt.Color;
import java.util.Calendar;
import loquendo.tts.engine.TTSReader;
import loquendo.tts.engine.TTSSession;
        
public class TareaPanel extends javax.swing.JPanel  {

    
    GestordeTareasApp g;
    Tarea tarea;
    
    public TTSSession hSession = null; 
        
    public TTSReader hReader = null;
    
    
    public TareaPanel(Tarea tarea,GestordeTareasApp g) {
        initComponents();
        this.setBackground(Color.WHITE);
    jnombre.setText(tarea.nombre);
    jEditorPane1.setText(tarea.Descripcion);
    H.setText(tarea.dia.get(Calendar.HOUR_OF_DAY)+"") ;
    M.setText(tarea.dia.get(Calendar.MINUTE)+"") ;
    S.setText(tarea.dia.get(Calendar.SECOND)+"") ;
    this.g=g;
    this.tarea=tarea; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jnombre = new javax.swing.JLabel();
        H = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        S = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEditorPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEditorPane1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jEditorPane1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 90));

        jLabel1.setText("Nombre:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));
        add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 250, 30));

        H.setText("H:");
        add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 30, 30));

        M.setText("M:");
        add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        S.setText("S:");
        add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jEditorPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditorPane1MouseClicked
     g.jEditorPane1.setText(tarea.Descripcion);
     g.jTextField1.setText(tarea.nombre);
     g.hora.setText(tarea.dia.get(Calendar.HOUR_OF_DAY)+"");
     g.min.setText(tarea.dia.get(Calendar.MINUTE)+"");
     g.seg.setText(tarea.dia.get(Calendar.SECOND)+"");
        
        try { hSession = new TTSSession();
               hReader = new TTSReader(hSession);
	       hReader.setAudio("LTTS7AudioBoard", null, 32000, "linear", 2);
	       hReader.loadPersona("Carmen",null,null);
	    
            
            String h=tarea.dia.get(Calendar.HOUR_OF_DAY)+":"+tarea.dia.get(Calendar.MINUTE)+":"+"\n";
            String aux=h;
            aux+="Es la hora de"+"\n";
            aux+=tarea.nombre+"\n";
            aux+=tarea.Descripcion+"\n";
            System.out.println(aux);
            hReader.read(aux, false, false);
           	
           
             } catch (Exception e) {e.printStackTrace();} 

            
                                      

// TODO add your handling code here:
    }//GEN-LAST:event_jEditorPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel H;
    private javax.swing.JLabel M;
    private javax.swing.JLabel S;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jnombre;
    // End of variables declaration//GEN-END:variables
}