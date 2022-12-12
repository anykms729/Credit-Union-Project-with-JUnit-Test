/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public class CarLoan {
    String ApplicantUniqueCode;
    int repaymentPeriod;
    double amountRequested;
     double monthlyInstallment;
    double totalRepayment;

    public void setApplicantUniqueCode(String applicantUniqueCode) {
        ApplicantUniqueCode = applicantUniqueCode;
    }

    public CarLoan() {
    }
    
    public CarLoan(int repaymentPeriod, double amountRequested) {
        this.repaymentPeriod = repaymentPeriod;
        this.amountRequested = amountRequested;
    }

    public void setrepaymentPeriod(int repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public void setAmountRequested(double amountRequested) {
        this.amountRequested = amountRequested;
    }
    
//    Monthly Interest Rate : 7% (irrespective of repayment period)
 public double calculateCarLoan(int repaymentPeriod, double amountRequested){
         monthlyInstallment = (amountRequested/repaymentPeriod)+(amountRequested*0.07)/repaymentPeriod;
     totalRepayment =(monthlyInstallment*repaymentPeriod);
        return totalRepayment;
    }
    
    public double getTotalRepayment() {
    return totalRepayment;
    }

    @Override
    public String toString() {
        return "{Loan Type = Car Loan" + ", Applicant Unique Code = " + ApplicantUniqueCode + ", Installment Period = " + repaymentPeriod +" months, Amount of Loan Requested = EUR " + amountRequested + ", Monthly Installment = EUR " + monthlyInstallment + ", Total Repayment = EUR " + totalRepayment + '}';
    }
}
