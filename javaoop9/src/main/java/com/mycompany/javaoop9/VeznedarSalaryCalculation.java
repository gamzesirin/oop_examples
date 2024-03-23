/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop9;

/**
 *
 * @author gamze
 */
public class VeznedarSalaryCalculation extends BaseSalaryCalculation{
    public VeznedarSalaryCalculation(){
        super(1000,100);
    }
    @Override
    public void salaryCalculation(){
          this.maas=(this.maas*oran/20+500);
        System.out.println("Veznedar maaşı: "+this.maas);
    }
}
