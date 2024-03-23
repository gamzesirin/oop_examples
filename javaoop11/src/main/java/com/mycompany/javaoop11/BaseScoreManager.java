/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop11;

/**
 *
 * @author gamze
 */
public abstract class BaseScoreManager {
    
    public abstract void scoreManager();
    
    public final void gameOver(){
        System.out.println("Oyun bitti !");
    }
}
