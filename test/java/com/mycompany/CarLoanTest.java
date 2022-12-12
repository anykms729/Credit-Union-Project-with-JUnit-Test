/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarLoanTest {
     @Test
     public void calculatePersonalLoanTest(){
        var carLoan = new CarLoan();
        assertEquals(1284,carLoan.calculateCarLoan(12,1200));
    } 
}
