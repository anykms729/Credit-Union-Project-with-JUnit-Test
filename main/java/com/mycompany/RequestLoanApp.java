/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.Scanner;

public class RequestLoanApp {

    public static void main(String[] args) {
        var requestLoanApp = new RequestLoanApp();
        String userUniqueCode="",userContinue;
        boolean userContinueMethodReturn, userUniqueCodeMethodReturn;
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Welcome to our ABC Credit Union");
        do {
            System.out.print("Please enter your unique customer code (5-digit alphabets): ");
            userUniqueCode = sc.next();
            if (requestLoanApp.userUniqueCodeMethod(userUniqueCode) == true) {
                System.out.println("Welcome " + userUniqueCode + " !");
                requestLoanApp.loanMenu(userUniqueCode);
            } else {
                System.out.println("Length unmatched! Unique code should be 5 digits alphabets!");
            }
            System.out.println("You want to continue? Yes or No?");
            userContinue = sc.next();
        } while (requestLoanApp.userContinueMethod(userContinue) == true);
        System.out.println("Thank for using our ABC credit union service!");
        System.exit(1);
    }

    public void loanMenu(String userUniqueCode) {
        Scanner sc = new Scanner(System.in);
        int userChoice;
        int repaymentPeriod;
        double annualIncome,amountRequested;
        String userCarOwnership, userContinue;
        int userAge;
        boolean annualIncomeAndRequestedLoanReturn;


        PersonalLoan myPersonalLoan = new PersonalLoan();
        StudentLoan myStudentLoan = new StudentLoan();
        CarLoan myCarLoan = new CarLoan();

        do {
            System.out.println("Please select Loan Service Type");
            System.out.println("1. Personal Loan");
            System.out.println("2. Student Loan");
            System.out.println("3. Car Loan");

            if (sc.hasNextInt()) {
                userChoice = sc.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.println("Welcome to ABC Credit Union's Personal Loan Service");
                        System.out.print("Please enter your annual Income: EUR ");
                        annualIncome = sc.nextDouble();
                        System.out.print("Please enter required Personal Loan Amount: EUR ");
                        amountRequested = sc.nextDouble();
                        if(myPersonalLoan.annualIncomeAndRequestedLoan(annualIncome, amountRequested) == false){
                        System.out.println("Your requested Loan amount can't exceed your annual Income!");
                        }
                        else {
                            myPersonalLoan.setAmountRequested(amountRequested);
                            myPersonalLoan.setApplicantUniqueCode(userUniqueCode);
                            System.out.print("Repayment Period (by Month): ");
                            repaymentPeriod = sc.nextInt();
                            if (0 < repaymentPeriod && repaymentPeriod < 13) {
                                myPersonalLoan.setrepaymentPeriod(repaymentPeriod);
                                myPersonalLoan.calculatePersonalLoan(repaymentPeriod, amountRequested);
                                System.out.println("Your Personal Loan Request detail is as follow: " + myPersonalLoan.toString());
                            }else {
                                System.out.println("Please enter valid range of months!");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Welcome to ABC Credit Union's Student Loan Service");
                        System.out.print("Please enter your age: ");
                        userAge = sc.nextInt();
                        if (userAge < 19 || userAge > 24) {
                            System.out.println("Student Loan is only available for people from the age of 19-24 ");
                        } else {
                            System.out.print("Please enter required Student Loan Amount: EUR ");
                            amountRequested = sc.nextDouble();
                            myStudentLoan.setAmountRequested(amountRequested);
                            myStudentLoan.setApplicantUniqueCode(userUniqueCode);

                            System.out.print("Repayment Period (by Month): ");
                            repaymentPeriod = sc.nextInt();
                            if (0 < repaymentPeriod && repaymentPeriod < 13) {
                                myStudentLoan.setrepaymentPeriod(repaymentPeriod);
                                myStudentLoan.calculateStudentLoan(repaymentPeriod, amountRequested);
                                System.out.println("Your Student Loan Request detail is as follow: " + myStudentLoan.toString());
                            }
                            else {
                                System.out.println("Please enter valid range of months!");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Welcome to ABC Credit Union's Car Loan Service");
                        System.out.println("Vehicle ownership? OWN or RENT");
                        userCarOwnership = sc.next();
                        if("own".equalsIgnoreCase(userCarOwnership)){
                            System.out.println("You should visit our branch to use Car Loan Service to purchase privately-owned car");
                            break;
                        }
                        else {
                            System.out.print("Please enter required Car Loan Amount: EUR ");
                            amountRequested = sc.nextDouble();
                            myCarLoan.setAmountRequested(amountRequested);
                            myCarLoan.setApplicantUniqueCode(userUniqueCode);
                            System.out.print("Repayment Period (by Month): ");
                            repaymentPeriod = sc.nextInt();
                            if (0 < repaymentPeriod && repaymentPeriod < 13) {
                                myCarLoan.setrepaymentPeriod(repaymentPeriod);
                                myCarLoan.calculateCarLoan(repaymentPeriod, amountRequested);
                                System.out.println("Your Car Loan Request detail is as follow: " + myCarLoan.toString());
                            } else {
                                System.out.println("Please enter valid range of months!");
                            }
                        }
                        break;
                    default:
                        System.out.println("Please choose valid range of Option!");
                        break;
                }
            } else {System.out.println("Please choose valid range of Integer Value!");}
            System.out.println("You want to continue? Yes or No?");
            userContinue = sc.next();
        } while ("yes".equalsIgnoreCase(userContinue));
        System.out.println("Thank for using our ABC credit union service!");
        System.exit(0);
    }

    public boolean userUniqueCodeMethod(String userUniqueCode){
        if (userUniqueCode.length() == 5){
            return true;
        }
        else return false;
    }

    public boolean userContinueMethod(String userContinue){
        if ("Yes".equalsIgnoreCase(userContinue)){
            return true;
        }
        else return false;
    }

}
