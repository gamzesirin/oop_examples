/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop2;

/**
 *
 * @author gamze
 */
public class Oop2 {

    public static void main(String[] args) {
        
        
        Ev yazlikEv = new Ev();
        yazlikEv.yaz();
        yazlikEv.kapiNo = 334;
        yazlikEv.sokakAdi = "Tufan";
        yazlikEv.yaz();
        
        Ev kislikEv = new Ev();
        kislikEv.yaz();

        Ev tmp = new Ev();
        tmp=yazlikEv;
        tmp.yaz();

        yazlikEv.kapiNo=123;
        yazlikEv.sokakAdi="Tunç";
        tmp.yaz();
        
        kislikEv.yaz();
        
        yazlikEv=kislikEv;//adres değişikliği yaptık gibi düşün. yazlik ev artık kislik evi işaret ediyor
        yazlikEv.yaz();
        
        tmp.yaz();// bu tmp  hala yazkik evi işaret ediyor onun içeriği değişmedi
 }
}

