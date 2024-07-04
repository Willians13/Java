package com.mycompany.aula;

public class Aula {

    int duracao;
    int sala;
    String dia;
    boolean cancelada;
    

    
    public void status(){
        System.out.println("Essa aula tem uma duraçao de " + this.duracao + "Horas");
        System.out.println("Vai ocorrer na sala : " + this.sala);
        System.out.println("Em um dia de " + this.dia);
        System.out.println("A aula esta cancelada ? " + this.cancelada);
    }
    
    public void cancelar(){
        this.cancelada = true;
        
    
    }      
}
