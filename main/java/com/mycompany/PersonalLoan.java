/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

public class PersonalLoan {
    String ApplicantUniqueCode;
    int repaymentPeriod;
    double amountRequested;
    double monthlyInstallment;
    double totalRepayment;
    double annualIncome;

    
    public PersonalLoan() {
    }
    
    public PersonalLoan(int repaymentPeriod, double amountRequested) {
        this.repaymentPeriod = repaymentPeriod;
        this.amountRequested = amountRequested;
    }

    public void setApplicantUniqueCode(String ApplicantUniqueCode) {
        this.ApplicantUniqueCode = ApplicantUniqueCode;
    }

    public void setrepaymentPeriod(int repaymentPeriod) {
        this.repaymentPeriod = repaymentPeriod;
    }

    public void setAmountRequested(double amountRequested) {
        this.amountRequested = amountRequested;
    }
    public void loanAndAnnualIncome(double amountRequested, double annualIncome){
    }
    
//  Interest Rate : 4% of Principal balance (irrespective of repayment period)
    public double calculatePersonalLoan(int repaymentPeriod, double amountRequested){
         monthlyInstallment = (amountRequested/repaymentPeriod)+(amountRequested*0.04)/repaymentPeriod;
     totalRepayment =(monthlyInstallment*repaymentPeriod);
        return totalRepayment;
    }
    public boolean annualIncomeAndRequestedLoan(double annualIncome, double amountRequested){
        return annualIncome>amountRequested;
    }
    
     
     
    public double getTotalRepayment() {
    return totalRepayment;
    }

    @Override
    public String toString() {
        return "{Loan Type = Personal Loan" + ", Applicant Unique Code = " + ApplicantUniqueCode + ", Installment Period = " + repaymentPeriod + " months, Amount of Loan Requested = EUR " + amountRequested + ", Monthly Installment = EUR " + monthlyInstallment + ", Total Repayment = EUR " + totalRepayment + '}';
    }
}
