package com.mycompany.testelutapoo;

import java.util.Random;


public class Luta {
    //atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;
   
    
    
    //metodos
    
    public void marcarluta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())&& l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
          this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
    }
    }  
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3); // Vai gerar 3 resultados (0,1,2)
            
            System.out.println("=== RESULTADO DA LUTA ===");
            switch(vencedor){ //Escolha o Vencedor
      
                    case 0: //empate
                        System.out.println("Empatou");
                        this.desafiado.empatarluta();
                        this.desafiante.empatarluta();
                        break;
                        
                    case 1: // Desafiado venceu
                        System.out.println(this.desafiado.getNome() + " Ganhou");
                        this.desafiado.ganharluta();
                        this.desafiante.perderluta();
                        break;
                        
                    case 2: // Desafiante venceu
                        System.out.println(this.desafiante.getNome() + " Ganhou");
                        this.desafiado.perderluta();
                        this.desafiante.ganharluta();
                        break;
                        
            }
             System.out.println("=================================");                     
            
        }else{
            System.out.println("Luta não foi aprovada");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador ddesafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
