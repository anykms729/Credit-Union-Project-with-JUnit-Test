/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

public class CarLoanTest {

    @Test
    @DisplayName("Check Car Loan Detail Info")
    public void calculateCarLoanTest() {
        var carLoan = new CarLoan();
        assertEquals(1284, carLoan.calculateCarLoan(12, 1200), () -> "Failed as car loan Interest is 7%");
    }

    @Test
    @DisplayName("Check Car Loan Repayment Period")
    public void carLoanRepaymentPeriodTest() {
        var carLoan = new CarLoan();
        assertTrue(carLoan.carLoanRepaymentPeriod(19), () -> "Failed as car loan repayment period should be no later than 19 months");
    }
}
