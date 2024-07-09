package com.mycompany.aula05poogua;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("------------------------------------");
        System.out.println("Conta :" + this.getNumConta());
        System.out.println("Tipo : " + this.getTipo());
        System.out.println("Dono : " + this.getDono());
        System.out.println("Saldo : " + this.getSaldo());
        System.out.println("Status : " + this.getStatus());
    }
    
    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") {
            this.setSaldo(50);
        } else {
            if (t == "CP") {
                this.setSaldo(150);
            }
        }
         System.out.println(" \nConta Aberta com Sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Não pode fechar a conta");
        } else {
            if (this.getSaldo() < 0) {
                System.out.println("Não pode fechar a conta");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada");

            }

        }
    }

    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito de " + v + " realizado com sucesso ");
        } else {
            System.out.println("Conta não existe ");
        }
    }

    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de " + v + " realizado com sucesso ");
            } else {
                System.out.println("Saldo insuficiente para sacar");
            }
        } else {
            System.out.println("Conta não existe ");
        }
    }

    public void pagarMensal() {
        float v = 0;

        if (this.getTipo() == "CC") {
            v = 12;
        } else {
            if (this.getTipo() == "CP") {
                v = 20;
            }
        }
        if (this.getStatus() == true) {
            if (this.getSaldo() > 0) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Conta não existe");
        }
    }
    /////////////////////////////////////

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    //////////////////////////////////////
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    ///////////////////////////////////////
    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    //////////////////////////////////////
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    ///////////////////////////////////////

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

}
