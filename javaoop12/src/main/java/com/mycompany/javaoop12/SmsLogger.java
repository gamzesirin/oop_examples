/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop12;

/**
 *
 * @author gamze
 */
public class SmsLogger implements Logger{
    @Override
    public void log(){
        System.out.println("Sms has been sent.");
    }
}
