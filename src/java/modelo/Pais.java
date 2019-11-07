/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Sebastian :3
 */
public class Pais extends Africa{
    
    ArrayList<Africa> paises = new ArrayList();
    
    Africa Argelia = new Africa("Argelia", "Argelino", "Dinar Argelino", "Arabe","Argel",0.036);
    Africa Marruecos = new Africa("Marruecos", "Marroqui", "Dirham marroqui", "Arabe", "Rabat",0.0029);
    Africa Camerun = new Africa("Camerun", "camerunes", "Franco", "Frances/Ingles", "Yaounde",0.17877);
    Africa Benin= new Africa();
    Africa Egipto = new Africa();
    
    public void cargarPais(){
       Benin.setNombre("Benin");
        Benin.setGentil("Benines");
        Benin.setNombreMoneda("Franco");
        Benin.setIdioma("Frances");
        Benin.setCapital("Porto novo");
        Benin.setPrecMomeda(0.17877);
        
        Egipto.setNombre("Egipto");
        Egipto.setGentil("Egipcio");
        Egipto.setIdioma("Arabe");
        Egipto.setNombreMoneda("Libra egipcia");
        Egipto.setCapital("El cairo");
        Egipto.setPrecMomeda(0.0048600);
        
    }
    
    public void cargarArray(){
        paises.add(Argelia);
        paises.add(Marruecos);
        paises.add(Camerun);
        paises.add(Benin);
        paises.add(Egipto);
    
}
       public void llenarText(){
        try
        {
            FileWriter Archivo = new FileWriter("input.txt");
            PrintWriter pw = new PrintWriter(Archivo);
            
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            pw.println("pais :" + pais.getNombre());
            pw.println("capital :" + pais.getCapital());
            pw.println("gentilicio :" + pais.getGentil());
            pw.println("idioma :" + pais.getIdioma());
            pw.println("nombre de la moneda :" +pais.getNombreMoneda());
            pw.println("precio de la moneda :" + pais.getPrecMomeda());
            
        }
        
                
            pw.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public String buscarNombre(String nombre){
        String a= nombre;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombre())){
                a=pais.getNombre();
            }
        }
        return a;
    }
    public String buscarCapital(String nombre){
        String a= nombre;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getCapital())){
                a=pais.getCapital();
            }
        }
        return a;
    }
    public String buscarIdioma(String nombre){
        String a= nombre;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
           Traduccion  pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getIdioma())){
                a=pais.getIdioma();
            }
        }
        return a;
    }
    public String buscarGentilico(String nombre){
        String a= nombre;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getGentil())){
                a=pais.getGentil();
            }
        }
        return a;
    }
    
    public String buscarMoneda(String nombre){
        String a= nombre;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (nombre.equalsIgnoreCase(pais.getNombreMoneda())){
                a=pais.getNombreMoneda();
            }
        }
        return a;
    }
    
    DecimalFormat o = new DecimalFormat("#.00");
    
    
   /* public String calcularMoneda(double precioMoneda ,double cantidad){
        double a=0;
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Traduccion pais = (Traduccion)it.next();
            if (precioMoneda == pais.getPrecMomeda()){
                a=Benin.convertidor(pais.getPrecMomeda(), cantidad);
            }
        }
        return (""+o.format(a));
    }
   public  String traductor(String idioma, String palabra){
      String a="  ";
      Iterator it = paises.iterator();
       while (it.hasNext()) {           
           Traduccion pais = (Traduccion)it.next();
           if (idioma.equalsIgnoreCase(pais.getIdioma())){
               a=Benin.traductor(palabra);
           }
       }
       return a;*/
   }
    

    
   


