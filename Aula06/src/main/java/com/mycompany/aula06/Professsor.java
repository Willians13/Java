
package com.mycompany.aula06;


public class Professsor extends Pessoa{
    
    private String especialidade;
    private float salario;   

    public void receberAumento(){
        this.salario = this.salario + (this.salario - (10/100));
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
