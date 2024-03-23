/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop9;

/**
 *
 * @author gamze
 */
public class BaseSalaryCalculation {
    public int maas;
    public int oran;
    
    public BaseSalaryCalculation(){
         
    }
     
    public BaseSalaryCalculation(int maas , int oran){
        this.maas=maas;
        this.oran=oran;
    }
      
    public void salaryCalculation(){
        this.maas=(this.maas*oran/20);
        System.out.println(this.maas);
    }
    
}
