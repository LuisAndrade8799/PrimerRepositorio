/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.cered.reloj;

import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Andrade
 */
public class ProyectoReloj {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Date reloj;
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        while(true){
            tk.beep();
            reloj = new Date();
            System.out.println(df.format(reloj));
            
            Thread.sleep(1000);
        }
        
        
        
        
    }
    
}
