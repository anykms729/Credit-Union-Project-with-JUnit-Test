package com.mycompany;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

public class PersonalLoanTest {
    @Test
    @DisplayName("Calculate Total Amount of Personal Loan")
     public void calculatePersonalLoanTest(){
        var personalLoan = new PersonalLoan();
        assertEquals(1248,personalLoan.calculatePersonalLoan(12,1200));
    }
     
     @Test
     @DisplayName("Compare User's Annual Income & Requested Loan Amount")
     public void annualIncomeAndRequestedLoanTest(){
        var personalLoan = new PersonalLoan();
        assertTrue(personalLoan.annualIncomeAndRequestedLoan(30000, 2000),()->"Requested Loan amount exceeds annual Income");
    }
}

