/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help.me.find.it.pkg2.pkg0;

import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author Vichoh
 */
public class Textos {
    
    private String nombreArchivo;
    private ArrayList <String> listas = new ArrayList();
    
    
    /*
    Constructor el cual necesita un string con el nombre del archivo al ser instansiado
    */
    public Textos(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
        lecturaArchivos();
    }

    /*
    getters y setters de los atributos.
    */
    
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public ArrayList<String> getListas() {
        return listas;
    }

    public void setListas(ArrayList<String> listas) {
        this.listas = listas;
    }
    
    
    /*
        metodo el cual no permite obtener datos de un archivo y guardarlos en su arraylist de la clase (lista)  
    */
    
    public void lecturaArchivos(){
        try{
            BufferedReader bf = new BufferedReader (new FileReader(this.nombreArchivo));
            
            String linea ;
            while((linea = bf.readLine()) != null ){
                listas.add(linea);
            }
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
    }
    
}
