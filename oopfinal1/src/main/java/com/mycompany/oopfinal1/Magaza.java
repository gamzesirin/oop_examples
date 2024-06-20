/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopfinal1;

/**
 *
 * @author gamze
 */
public class Magaza {
    private int siparisKod=45;
    private static String magazaKod="b1b";
    private static boolean indirim;
    
    /**
     * @return the magazaKod
     */
    public static String getMagazaKod() {
        return magazaKod;
    }

    /**
     * @param aMagazaKod the magazaKod to set
     */
    public static void setMagazaKod(String aMagazaKod) {
        magazaKod = aMagazaKod;
    }

    /**
     * @return the indirim
     */
    public static boolean isIndirim() {
        return indirim;
    }

    /**
     * @param aIndirim the indirim to set
     */
    public static void setIndirim(boolean aIndirim) {
        indirim = aIndirim;
    }

    /**
     * @return the siparisKod
     */
    public int getSiparisKod() {
        return siparisKod;
    }

    /**
     * @param siparisKod the siparisKod to set
     */
    public void setSiparisKod(int siparisKod) {
        this.siparisKod = siparisKod;
    }
 
}
