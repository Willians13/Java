package com.mycompany.testelutapoo;


public class Lutador {

   //atributos
   private String nome;
   private String nacionalidade;
   private int idade;
   private float altura;
   private float peso;
   private String categoria;
   private int vitorias;
   private int derrotas;
   private int empates;

   //construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        
    }
    
   //metodos
   public void apresentar(){
      
       System.out.println("-----------------------------------------------");
       System.out.println("Lutador: " + getNome());
       System.out.println("Origem : " + getNacionalidade());
       System.out.println(getIdade() + " anos");
       System.out.println(getAltura() + "m de altura");
       System.out.println(getPeso() + "kg");
       System.out.println("Categoria : " + getCategoria());
       System.out.println("Vitorias : " + getVitorias() + " | Derrotas : " + getDerrotas() + " | Empates : " + getEmpates());

   }
   public void status(){         
       System.out.println("---------------------");
       System.out.println(getNome());
       System.out.println("É um  " + getCategoria());
       System.out.println(getVitorias() + " Vitorias");
       System.out.println(getDerrotas() + " Derrotas");
       System.out.println(getEmpates() + " Empates");
   }
   
   
   
   public void ganharluta(){         
       this.setVitorias(this.getVitorias() + 1 );
   }
   public void perderluta(){         
       this.setDerrotas(this.getDerrotas() + 1);
   }
   public void empatarluta(){         
       this.setEmpates(this.getEmpates() + 1);
   }

   
   //getters e setters
   
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    
      public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria(); 
    }

     public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(getPeso()< 52.2){
            this.categoria = "Invalido";
        }else if(getPeso() <= 70.3){
            this.categoria = "Peso Leve";
        }else if (getPeso() <= 83.9){
            this.categoria = "Peso Medio";
        }else if(getPeso() <= 120.2 ){
            this.categoria = "Peso Pesado";
        }else{
            this.categoria = "Invalido";
        }
        
    }
    
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
   
}
