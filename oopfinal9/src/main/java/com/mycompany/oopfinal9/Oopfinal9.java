/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopfinal9;

/**
 *
 * @author gamze
 */
public class Oopfinal9 {

    public static void main(String[] args) {
//        Kedi kedi1 = new Kedi();
//        Kaplumbaga kap1= new Kaplumbaga();
//        Beslen besle1 = new  Beslen();
//        besle1.Besle(kedi1);
//        besle1.Besle(kap1);
        
////        
//        Hayvan hayvan1 = new Kedi();
//        Beslen besle2 = new Beslen();
//        besle2.Besle(hayvan1);

//
//        Hayvan hayvan = new Hayvan();
//        Kedi kedi = hayvan;
//
//        Hayvan hayvan2 = new Hayvan();
//        Kedi kedi =(Kedi) hayvan2;
//        kedi.Miyavla();

////
            Hayvan h1 = new Kaplumbaga();
            if(h1 instanceof Kedi){
                Kedi k1 = (Kedi) h1;
                k1.Miyavla();
            }
            else if (h1 instanceof Kaplumbaga){
                Kaplumbaga kaplumbaga1 = (Kaplumbaga) h1;
                System.out.println(kaplumbaga1.beslen());
            }
    }
}
