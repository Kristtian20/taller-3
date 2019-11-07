/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;


public class Traduccion  extends Africa implements iTraduc {
    
    private String nombre;
    private String gentil;
    private String moneda;
    private String idioma;
    private String capital;
     private String palabra;
    public Traduccion(String nombre,String capital,String gentil,String nombreMoneda,String idioma, double precMoneda){
        this.setNombre(nombre);
        this.setCapital(capital);
        this.setGentil(gentil);
        this.setNombreMoneda(nombreMoneda);
        this.setIdioma(idioma);
        
    }

    public Traduccion() {
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
       public String traductor(String idioma,String palabra) {
        String traduccion = idioma;
        String p = palabra;
        try {
            
        switch(palabra){
            case "hola":
                if(idioma.equals("frances")){
                    palabra = "salut"; 
                    
                }
                if(idioma.equals("arabe")){
                    palabra = "marhabaan"; 
                    
                }
            return palabra;
                
            case "adios":
                if(idioma.equals("frances")){
                     
                    palabra = "adiu";
                }
                if(idioma.equals("arabe")){
                    palabra = "wadaeaan"; 
                    
                }
            return  palabra;
            case "perro":
                if(idioma.equals("frances")){
                     
                    palabra = "chien";
                }
                if(idioma.equals("arabe")){
                    palabra = "kalb"; 
                    
                }
            return  palabra;
            case "computador":
                if(idioma.equals("frances")){
                     
                    palabra = "ordinateur";
                }
                if(idioma.equals("arabe")){
                    palabra ="alkambyutir"; 
                    
                }
            return palabra;
            case "casa":
                if(idioma.equals("frances")){
                     
                    palabra = "maison";
                }
                if(idioma.equals("arabe")){
                    palabra = "manzil"; 
                    
                }
            return palabra;
                case "gato":
                if(idioma.equals("frances")){
                     
                    palabra = "chat";
                }
                if(idioma.equals("arabe")){
                    palabra = "qut"; 
                    
                }
            return palabra;
                
            case "esfero":
                if(idioma.equals("frances")){
                     
                    palabra = "sphères";
                }
                if(idioma.equals("arabe")){
                    palabra = "I esfero"; 
                    
                }
            return  palabra;
            case "papa":
                if(idioma.equals("frances")){
                     
                    palabra = "papa";
                }
                if(idioma.equals("arabe")){
                    palabra = "albatatis"; 
                    
                }
            return  palabra;
            case "mama":
                if(idioma.equals("frances")){
                     
                    palabra = "maman";
                }
                if(idioma.equals("arabe")){
                    palabra = "thadi"; 
                    
                }
            return palabra;
            case "celular":
                if(idioma.equals("frances")){
                     
                    palabra = "téléphone portable";
                }
                if(idioma.equals("alhatif alkhaliwiu")){
                    palabra = "qut"; 
                    
                }
            return palabra;
        }
        
        
        } catch (NumberFormatException  e) {
            
            System.out.println("se debe ingresar un numero."+e.getMessage());
        }
        return traduccion;
    }

    @Override
    public double convertidor(double precioMoneda, double cantidad) {
        double valor=0;
        try {
            valor = cantidad * precioMoneda;
               
        } catch (Exception e) {
            System.out.println("se debe ingresar un numero."+e.getMessage());
        }
        return valor; 
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
