/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop11;

/**
 *
 * @author gamze
 */
public class Javaoop11 {

    public static void main(String[] args) {
       BaseScoreManager baseScoreManager = new MenScoreManager();
       baseScoreManager.scoreManager();
       baseScoreManager.gameOver();
       
       BaseScoreManager baseScoreManager1 = new WomanScoreManager();
       baseScoreManager1.scoreManager();
       baseScoreManager1.gameOver();
       
       BaseScoreManager baseScoreManager2 = new ChildScoreManager();
       baseScoreManager2.scoreManager();
       baseScoreManager2.gameOver();
    }
}
