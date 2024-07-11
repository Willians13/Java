package com.mycompany.testelutapoo;


public class TesteLutaPOO {

    public static void main(String[] args) {
        
        Lutador l []= new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "Franca" ,31 , 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil" ,29 , 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA" ,35 , 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia" ,28 , 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("Claudão", "Argentina" ,28 , 1.80f, 75.9f, 9, 6, 2);
        l[5] = new Lutador("GIgolô", "Mexico" ,37 , 1.99f, 90.9f, 5, 1, 8);
        
        
       Luta UEC01 = new Luta();
       
       UEC01.marcarluta(l[1], l[1]);
       UEC01.lutar();
       l[1].status();
       l[1].status();
    }
}
