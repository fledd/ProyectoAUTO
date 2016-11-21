/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_auto;

/**
 *
 * @author Vaio
 */
public class ProyectoFinal_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        JFprincipal windows=new JFprincipal();
        windows.txtreglas.setEnabled(false);
        windows.txtpalabras.setEnabled(false);
        windows.area1.setEnabled(false);
        windows.area2.setEnabled(false);
        windows.area3.setEnabled(false);
        windows.resultado.setEnabled(false);
        windows.palabras.setEnabled(false);
        
        
        windows.setVisible(true);
        windows.setLocationRelativeTo(null);
        
        
        
        
    }
    
}
