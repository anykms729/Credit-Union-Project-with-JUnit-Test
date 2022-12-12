/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentLoanTest {
 @Test
     public void calculatePersonalLoanTest(){
        var studentLoan = new StudentLoan();
        assertEquals(1224,studentLoan.calculateStudentLoan(12,1200));
    } 
}
