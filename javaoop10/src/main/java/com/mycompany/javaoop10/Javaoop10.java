/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop10;

/**
 *
 * @author gamze
 */
public class Javaoop10 {

    public static void main(String[] args) {
//        BaseCreditManager creditManager = new StudentCreditManager();
//        BaseCreditManager creditManager1 = new TeacherCreditManager();
//        BaseCreditManager creditManager2 = new SoldierCreditManager();
//        
//        System.out.println( creditManager.CreditCalculate(1000.0));
//        System.out.println( creditManager1.CreditCalculate(1000.0));
//        System.out.println(creditManager2.CreditCalculate(1000.0));
//        
        BaseCreditManager [] baseCreditManagers = new BaseCreditManager []{
            new SoldierCreditManager(),
            new TeacherCreditManager(),
            new StudentCreditManager()
        };
        
        for ( BaseCreditManager creditManager:baseCreditManagers) {
            System.out.println(creditManager.CreditCalculate(1000.0));
            
        }
        
    }
}
