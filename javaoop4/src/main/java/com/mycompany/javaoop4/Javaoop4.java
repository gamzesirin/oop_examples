/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop4;

/**
 *
 * @author gamze
 */
public class Javaoop4 {

    public static void main(String[] args) {
       int number=5;
        System.out.println(number);
        changeTheValue(number);
        System.out.println(number);//10 yazmaz 5 yazar

        
        PassByReference referance = new PassByReference();
        referance.number2=20;
        System.out.println(referance.number2);//20 basar
        referance.change(referance);
        System.out.println(referance.number2); //25 basar

        Arrayasareference arrayreference = new Arrayasareference();
        int [] array=new int[]{2,3,4};
        System.out.println(array[0]);
        arrayreference.changethearray(array);
        System.out.println(array[0]);
        
    }
    
    public static void changeTheValue(int number){//pass by value kopya ile işlem yapılır 
        number=number+5;
    }
    
}


//nesne özellikleri instance değişkenlerdir belli bir sınıfın içinde tanımlanırlar

//passbyvalue da değer değişmezken referancebyvalue da orijinal veri değişir
