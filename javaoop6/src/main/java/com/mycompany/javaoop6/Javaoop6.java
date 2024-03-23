/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop6;

/**
 *
 * @author gamze
 */
public class Javaoop6 {

    public static void main(String[] args) {
       Calculator calc = new Calculator();
       calc.add(10, 20);
       calc.add(10, 20,50);
       double x=calc.add(12.3, 10.0, 13.2);
        System.out.println("toplam 2 = "+ x );
    }
}
