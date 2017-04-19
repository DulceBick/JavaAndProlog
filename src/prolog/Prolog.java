/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

import org.jpl7.Query;

/**
 *
 * @author Bick
 */
public class Prolog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Interfaz a= new Interfaz ();
          Horoscopo a = new Horoscopo();
           a.setBounds(500,100,680,420);
           a.setVisible(true);
           a.setResizable(false);
         
        
         
//           Todo a = new Todo();
//           a.setBounds(500,100,680,500);
//           // a.setBounds(500,100,680,420);

            
          /**try {
            String conexion = "consult('ejericio1.pl')";
            Query con = new Query(conexion);
            System.out.println(conexion + "   " + (con.hasMoreSolutions() ? "ACEPTADO" : "FALLADO"));
            System.out.println("Iniciando la Suma");
            String consul = "suma(5,6,C).";
            Query ejecutar = new Query(consul);
            if (ejecutar.hasSolution()) {
                System.out.println("La suma es : "+ejecutar.oneSolution().get("C").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       */
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
