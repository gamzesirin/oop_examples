package oop;
public class NewMain2 {
    public static void main(String[] args) {
        AVPII ogrenci1 = new AVPII(200024,"Bilal Kılıç",65,75);
        System.out.println(ogrenci1.ortalama);
        ogrenci1.ortalamahesapla();
        System.out.println(ogrenci1.ortalama);
        ogrenci1.harfnothesap();
        System.out.println(ogrenci1.harfnot);
      
        AVPII ogrenci2 = new AVPII(200025,"Doğukan Coşkun",70,70);
        System.out.println("Öğrencinin adı: "+ogrenci2.adsoyad+" ve öğrencinin numarası: "+ogrenci2.ogrencino);
        ogrenci2.ortalamahesapla();
        ogrenci2.harfnothesap();
        System.out.println("Öğrencinin ortalaması: "+ogrenci2.ortalama+" ve öğrencenin harf notu: "+ogrenci2.harfnot);
        
    }
    
}
