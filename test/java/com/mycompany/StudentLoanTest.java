/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

public class StudentLoanTest {

    @Test
    @DisplayName("Check Student Loan Detail Info")
    public void calculateStudentLoanTest() {
        var studentLoan = new StudentLoan();
        assertEquals(1224, studentLoan.calculateStudentLoan(12, 1200));
    }

    @Test
    @DisplayName("Check Student Loan Repayment Period")
    public void studentLoanRepaymentPeriodTest() {
        var studentLoan = new StudentLoan();
        assertTrue(studentLoan.studentLoanRepaymentPeriod(47), () -> "Failed as student loan repayment period should be no later than 48 months");
    }

    @Test
    @DisplayName("Check age for Student Loan age limitation")
    public void ageLimitationForStudentLoanTest() {
        var studentLoan = new StudentLoan();
        assertTrue(studentLoan.ageLimitationForStudentLoan(23), () -> "Student Loan service is only availiable for those whose age 19-24 years");
    }
}
