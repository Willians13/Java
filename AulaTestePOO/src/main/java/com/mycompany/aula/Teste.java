package com.mycompany.aula;

public class Teste {
      public static void main(String[] args) {
      Aula primeira = new Aula();
       
      primeira.duracao = 2;
      primeira.sala = 12;
      primeira.dia = "Segunda";
      primeira.cancelada = false;
      
      primeira.cancelar();
      primeira.status();
       
      System.out.println("-----------------------------------------------------");
      
      Aula Segunda = new Aula();
      
      Segunda.duracao = 3;
      Segunda.sala = 18;
      Segunda.dia = "Quarta";
      Segunda.cancelada = false;
      
      Segunda.status();
      
      
      
}
}
    