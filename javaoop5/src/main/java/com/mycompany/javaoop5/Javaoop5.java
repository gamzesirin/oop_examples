/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop5;

/**
 *
 * @author gamze
 */
public class Javaoop5 {

    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.name+ " "+ product.model+" "+ product.color +" "+product.price +" "+product.stockAmount);
        Product product1 = new Product("Lenovo","ideaPAd",18000);
        System.out.println(product1.name+ " "+ product1.model+" "+product1.price );


    }
}
