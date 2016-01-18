/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help.me.find.it.pkg2.pkg0;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Vichoh
 */
public class Micros {
    
    private String linea;
    private int numeroLista;
    private String destino;
    private List <String> paraderosSubidas;
    private Textos subidasMicro ;
    
    public Micros (String linea , int numeroLista){
        this.linea = linea;
        this.numeroLista = numeroLista;
        subidasMicro = new Textos("subidasMicro.txt");
        Textos destinoMicro = new Textos("destinosMicro.txt");
        
        this.destino = destinoMicro.getListas().get(this.numeroLista);
        paraderosSubidas = new ArrayList<String>(Arrays.asList(seleccionSubida().split(",")));
        
    }
    
    
    public String seleccionSubida (){
        return subidasMicro.getListas().get(numeroLista);
    }
    
    
    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<String> getParadareosSubidas() {
        return paraderosSubidas;
    }

    public void setParadareosSubidas(ArrayList<String> paradareosSubidas) {
        this.paraderosSubidas = paradareosSubidas;
    }

   
    
    
}
