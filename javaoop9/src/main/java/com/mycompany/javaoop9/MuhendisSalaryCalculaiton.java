/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop9;

/**
 *
 * @author gamze
 */
public class MuhendisSalaryCalculaiton extends BaseSalaryCalculation{
    public MuhendisSalaryCalculaiton(){
        super(1000,200);
    }
    public void salaryCalculation(){
         this.maas=(this.maas*oran/20);
        System.out.println("Mühendis maaşı: "+this.maas);
    }
    
}
