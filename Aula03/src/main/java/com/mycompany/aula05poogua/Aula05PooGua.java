package com.mycompany.aula05poogua;

public class Aula05PooGua {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1);
        p1.setDono("Jubileu");
       
        p1.abrirConta("CC");
        p1.depositar(100);
       
        p1.fecharConta();
        p1.estadoAtual();
         
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2);
        p2.setDono("Creusa");
        
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        p2.estadoAtual();

    }
}
