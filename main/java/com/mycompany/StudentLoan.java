/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public class StudentLoan {

    String ApplicantUniqueCode;
    int repaymentPeriod, userAge;
    double amountRequested;
    double monthlyInstallment;
    double totalRepayment;

    public StudentLoan() {
    }

    public StudentLoan(int repaymentPeriod, double amountRequested) {
        this.repaymentPeriod = repaymentPeriod;
        this.amountRequested = amountRequested;
    }

    public void setApplicantUniqueCode(String applicantUniqueCode) {
        ApplicantUniqueCode = applicantUniqueCode;

    }

    public void setrepaymentPeriod(int repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public void setAmountRequested(double amountRequested) {
        this.amountRequested = amountRequested;
    }

    public boolean studentLoanRepaymentPeriod(int repaymentPeriod) {
        return repaymentPeriod > 0 && repaymentPeriod <= 48;
    }
    
    public boolean ageLimitationForStudentLoan(int userAge) {
        return userAge >= 19 && userAge <= 24;
    }
    
//    Monthly Interest Rate : 2% (irrespective of repayment period)
    public double calculateStudentLoan(int repaymentPeriod, double amountRequested) {
        monthlyInstallment = (amountRequested / repaymentPeriod) + (amountRequested * 0.02) / repaymentPeriod;
        totalRepayment = (monthlyInstallment * repaymentPeriod);
        return totalRepayment;
    }

    public double getTotalRepayment() {
        return totalRepayment;
    }

    @Override
    public String toString() {
        return "{Loan Type = Student Loan" + ", Applicant Unique Code = " + ApplicantUniqueCode + ", Installment Period = " + repaymentPeriod + " months, Amount of Loan Requested = EUR " + amountRequested + ", Monthly Installment = EUR " + monthlyInstallment + ", Total Repayment = EUR " + totalRepayment + '}';
    }
}
