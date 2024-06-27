/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopfinal7;

/**
 *
 * @author gamze
 */
public class Oopfinal7 {
    
    public enum AlanKodu{
        ISPARTA("ISP",246),ANTALYA("ANT",121),BURDUR("BUR",434);
        
        private String kısaltma;
        private int kod;
        AlanKodu(String kısaltma,int kod){
            this.kısaltma=kısaltma;
            this.kod=kod;
        }
        public String getKısaltma(){
            return kısaltma;
        }
        public int getKod(){
            return kod;
        }
    }
    
    
    

    public static void main(String[] args) {
        AlanKodu alan=AlanKodu.ISPARTA;
        System.out.println(alan.getKısaltma());
        System.out.println(alan.getKod());
        System.out.println(alan.name());
        System.out.println(alan.ordinal());
        
        for(AlanKodu a: AlanKodu.values()){
            System.out.println(a.name());
        }
    }
}
