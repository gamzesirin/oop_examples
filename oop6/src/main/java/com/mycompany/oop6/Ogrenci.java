/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop6;

/**
 *
 * @author gamze
 */
public class Ogrenci {
    public int ogrenciNo;
    public String isim;
    Ders ders1;
    
   
   public String ekranaYaz(){
      String yaz=isim +" isimli öğrenci ";
      if(ders1!=null){
         yaz+= ders1.dersAdi+" isimli ve "+ ders1.dersId +" numaralı dersi almıstır";
      }
      else{
          yaz+=" ders almamıştır. ";
      }
      return yaz;
     
   }
}
