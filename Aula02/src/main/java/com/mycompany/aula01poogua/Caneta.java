package com.mycompany.aula01poogua;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status (){
        System.out.println("Qual é o modelo ? " + this.modelo);
        System.out.println("Uma caneta " + this.cor);  
        System.out.println("Está tampada ? " + this.tampada);
        System.out.println("Qual é a sua ponta ? " + this.ponta);
        System.out.println("SUa carga é : " + this.carga);
    }
    
    void rabiscar(){
         if (this.tampada == true){
            System.out.println("ERRO! n posso escrever ");
        }else{
            System.out.println("OK! Começando a rabiscar ");
    }
}
    void tampar(){
       this.tampada = true;
    }   
    
    void destampar(){
        this.tampada = false;
    }
    
}














    /*String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Do tipo " + this.modelo);
        System.out.println("Com uma carga de  " + this.carga + "% ");
        System.out.println("Ela esta tampada ? " + this.tampada);
    }
    void rabiscar(){
       if (this.tampada == true){
           System.out.println("ERRO!");
       }else{
           System.out.println("Estou Rabiscando");
    }
    }
    void tampar(){
        this.tampada = true;
    }

    void destampar (){
        this.tampada = false;
    }

}*/
