package com.mycompany.aula01poogua;

public class Aula01PooGua {

    public static void main(String[] args) {
       Caneta c1= new Caneta();
       
       System.out.println("Caneta numero 1 :");
       c1.modelo = "Bic";
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.carga = 95;
       c1.destampar();
       
       c1.status();
       c1.rabiscar();
     
       Caneta c2 = new Caneta();
       
        System.out.println("------------------------------------------");
       
       System.out.println("Caneta numero 2 :");
       c2.modelo = "Cristal";
       c2.cor = "Preta";
       c2.ponta = 0.8f;
       c2.carga = 70;
       c2.tampar();
       
       c2.status();
       c2.rabiscar();
       
       
    }
}    
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    

