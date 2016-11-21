/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_auto;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Vaio
 */
public class Metodos {
    
    public static ArrayList<String> lineas = new ArrayList<String>();
    public static ArrayList<String> lineas2 = new ArrayList<String>();
    String palabra;
    char[] aCaracteres;
    String palabra2;
    char[] aCaracteres2;
    
   
    
  
    
    
          public String leer(String leer)
           {
               
               
                File archivo = null;
                FileReader fr = null;
                
                try {
                        archivo = new File (leer);
                        String linea;
                        fr = new FileReader (archivo);
                        BufferedReader br = new BufferedReader(fr);
                        while((linea=br.readLine())!=null){
                        lineas.add(linea);
                        }
       
                      
           }//FIN DEL TRY
           catch(IOException e){
                System.out.println(e);
           }
           finally{
           try{ //el bloque finally se ejecuta siempre, por eso, si se cierra el fichero
           if( fr != null){ //al final del primer try, y ha dado un error antes, pasaría
           fr.close(); //al 1er catch y luego saldría, dejándolo abierto. Es conveniente
           } //cerrarlo aquí, comprobando que no sea -por un error anterior, como
           }catch (IOException e){ // no tener permisos de lectura o que no exista - de valor null.
           }
           }
                return null;
          
          }
       
    
     public String leer2(String leer)
           {
               
               
                File archivo = null;
                FileReader fr = null;
                
                try {
                        archivo = new File (leer);
                        String linea2;
                        fr = new FileReader (archivo);
                        BufferedReader br = new BufferedReader(fr);
                        while((linea2=br.readLine())!=null){
                        lineas2.add(linea2);
                        }
           }//FIN DEL TRY
           catch(IOException e){
                System.out.println(e);
           }
           finally{
           try{ //el bloque finally se ejecuta siempre, por eso, si se cierra el fichero
           if( fr != null){ //al final del primer try, y ha dado un error antes, pasaría
           fr.close(); //al 1er catch y luego saldría, dejándolo abierto. Es conveniente
           } //cerrarlo aquí, comprobando que no sea -por un error anterior, como
           }catch (IOException e){ // no tener permisos de lectura o que no exista - de valor null.
           }
           }
                return null;
          
          }
     
    
     
     
    
}
