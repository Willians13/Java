
package com.mycompany.aula06;


public class Aluno extends Pessoa{
    
    private String curso;
    private int numMatricula; 

    
   public void cancelarMatricula(){
       this.numMatricula = this.numMatricula - this.numMatricula;
       
   }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    
}
