/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop9;

/**
 *
 * @author gamze
 */
public class Javaoop9 {

    public static void main(String[] args) {
        
       MuhendisSalaryCalculaiton MuhSalCalc = new MuhendisSalaryCalculaiton();
       MuhSalCalc.salaryCalculation();
       
       MudurSalaryCalculation MudurSalCalc = new MudurSalaryCalculation();
       MudurSalCalc.salaryCalculation();
       
       VeznedarSalaryCalculation VezSalCalc = new VeznedarSalaryCalculation();
       VezSalCalc.salaryCalculation();
       
       
       BaseSalaryCalculation baseSalaryCalc = new MuhendisSalaryCalculaiton();
       baseSalaryCalc.salaryCalculation();
       
       BaseSalaryCalculation baseSalaryCalc2 = new MudurSalaryCalculation();
       baseSalaryCalc2.salaryCalculation();
       
       BaseSalaryCalculation baseSalaryCalc3 = new VeznedarSalaryCalculation();
       baseSalaryCalc3.salaryCalculation();
    }
}
