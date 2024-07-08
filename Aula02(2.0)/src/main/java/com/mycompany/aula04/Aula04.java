package com.mycompany.aula04;

public class Aula04 {

    public static void main(String[] args) {
    
         Caneta c1 = new Caneta("Bic", "Azul", 0.5f);
         c1.status();
         
         Caneta c2 = new Caneta("OPA", "preta", 0.7f);
         c2.destampar();
         c2.status();
    }
}
