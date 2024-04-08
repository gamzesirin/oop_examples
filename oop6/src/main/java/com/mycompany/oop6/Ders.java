/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

/**
 *
 * @author gamze
 */
public class Ders {
    public int dersId;
    public String dersAdi;
    Ogrenci ogr1;
    
    public String ekranaYaz(){
      String yaz=dersAdi +" isimli dersi ";
      if(ogr1!=null){
         yaz+= ogr1.isim+" isimli ve "+ ogr1.ogrenciNo +" numaralı öğrenci almıstır";
      }
      else{
          yaz+=" öğrenci almamıştır. ";
      }
      return yaz;
    }
    
}
