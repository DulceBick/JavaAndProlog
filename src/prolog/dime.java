/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.jpl7.Query;
/**
/**
 *
 * @author Dulce Bick
 */
public class dime extends javax.swing.JFrame {

    /**
     * Creates new form dime
     */
    public dime() {
        initComponents();
        setTitle("Obten tu horoscopo");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/nana.jpg"));
        setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zodiaco = new javax.swing.JFormattedTextField();
        consulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resulto = new javax.swing.JTextArea();
        horossss = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        zodiaco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                zodiacoKeyTyped(evt);
            }
        });
        getContentPane().add(zodiaco);
        zodiaco.setBounds(180, 240, 150, 40);

        consulta.setBackground(new java.awt.Color(255, 204, 204));
        consulta.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        consulta.setText("Dime");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                consultaKeyTyped(evt);
            }
        });
        getContentPane().add(consulta);
        consulta.setBounds(340, 240, 110, 40);

        resulto.setColumns(20);
        resulto.setRows(5);
        jScrollPane1.setViewportView(resulto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(150, 300, 300, 170);

        horossss.setBackground(new java.awt.Color(255, 255, 255));
        horossss.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        horossss.setForeground(new java.awt.Color(255, 255, 255));
        horossss.setText("Escribe tu signo:");
        getContentPane().add(horossss);
        horossss.setBounds(20, 230, 150, 50);

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton1.setText("INICIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 110, 110, 30);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/HOROSCOPOS (2).png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 680, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultaKeyTyped

char car = evt.getKeyChar(); 
if((car<'a' || car>'z'))
{
evt.consume();
    
}else{
  //  z.setText(z.getText()+String.valueOf(evt.getKeyChar()));
}




        // TODO add your handling code here:
    }//GEN-LAST:event_consultaKeyTyped

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed

        
        
   String sig = String.valueOf(zodiaco.getText());
           
           System.out.println(sig);
         
          try {
            String conexion = "consult('horoscopo.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion + "" + (con.hasMoreSolutions() ? "ACEPTADO" : "FALLADO"));
            System.out.println("Iniciando la prueba");
            String consul = "prueba2("+sig+",Y).";
            Query ejecutar = new Query(consul);
            if (ejecutar.hasSolution()) {
           
           System.out.println(" Tu horóscopo es: "+ejecutar.oneSolution().get("Y").toString());
           
           resulto.setText(String.valueOf(ejecutar.oneSolution().get("Y").toString()));
           
             
             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
           




        // TODO add your handling code here:
    }//GEN-LAST:event_consultaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


            Horoscopo a = new Horoscopo();
            a.setBounds(500,100,680,420);
            a.setResizable(false);
            a.setVisible(true);
            this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void zodiacoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_zodiacoKeyTyped

char car = evt.getKeyChar(); 
if((car<'a' || car>'z'))
{
evt.consume();
    
}else{
  //  z.setText(z.getText()+String.valueOf(evt.getKeyChar()));
}




        // TODO add your handling code here:
    }//GEN-LAST:event_zodiacoKeyTyped

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
            java.util.logging.Logger.getLogger(dime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consulta;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel horossss;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resulto;
    private javax.swing.JFormattedTextField zodiaco;
    // End of variables declaration//GEN-END:variables
}
