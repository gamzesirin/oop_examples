/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop8;

/**
 *
 * @author gamze
 */
public class Javaoop8 {

    public static void main(String[] args) {
      Product product = new Product("telefon", "apple" , "13 pro", 10000);
      System.out.println(product.name +" "+ product.brand+" "+ product.model+" "+product.price);
      ProductManager productmanager = new ProductManager();
      productmanager.addproduct(product);
      
    } 
}
