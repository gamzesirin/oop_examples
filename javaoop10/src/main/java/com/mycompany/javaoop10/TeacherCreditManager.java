/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop10;

/**
 *
 * @author gamze
 */
public class TeacherCreditManager extends BaseCreditManager{
    @Override
    public double CreditCalculate(double tutar){
        return tutar*1.20;
    }
}
