package com.mycompany;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

public class PersonalLoanTest {

    @Test
    @DisplayName("Calculate Total Amount of Personal Loan")
    public void calculatePersonalLoanTest() {
        var personalLoan = new PersonalLoan();
        assertEquals(1248, personalLoan.calculatePersonalLoan(12, 1200));
    }

    @Test
    @DisplayName("Compare Annual Income & Requested Loan Amount")
    public void annualIncomeAndRequestedLoanTest() {
        var personalLoan = new PersonalLoan();
        assertTrue(personalLoan.annualIncomeAndRequestedLoan(100, 20), () -> "Failed as requested Loan amount can't exceed annual Income");
    }

    @Test
    @DisplayName("Check Loan Request Frequency")
    public void personalLoanRequestFrequencyTest() {
        var personalLoan = new PersonalLoan();
        assertTrue(personalLoan.personalLoanRequestFrequency(3), () -> "Failed as annual loan request frequency can't exceed more than 4 times!");
    }
    
    @Test
    @DisplayName("Check Loan Repayment Period")
    public void personalLoanRepaymentPeriodTest() {
        var personalLoan = new PersonalLoan();
        assertTrue(personalLoan.personalLoanRepaymentPeriod(21), () -> "Failed as personal loan repayment period should be no later than 24 months");
    }
}
