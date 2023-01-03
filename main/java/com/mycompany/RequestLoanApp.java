
package com.mycompany;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RequestLoanApp {

    public static void main(String[] args) {
        var requestLoanApp = new RequestLoanApp();
        String userUniqueCode = "", userContinue;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to our ABC Credit Union");
        do {
            System.out.print("Please enter Unique code consists of 5 characters + 3 numbers: ");
            userUniqueCode = sc.next();
            if (requestLoanApp.userUniqueCodeMethod(userUniqueCode) == true) {
                System.out.println("Welcome " + userUniqueCode + " !");
                requestLoanApp.loanMenu(userUniqueCode);
            } else {
                System.out.println("Length or Data type unmatched! Unique code consists of 5 characters + 3 numbers!");
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
        double annualIncome, amountRequested;
        String userCarOwnership, userContinue;
        int loanRequestFrequency, userAge;

        PersonalLoan myPersonalLoan = new PersonalLoan();
        StudentLoan myStudentLoan = new StudentLoan();
        CarLoan myCarLoan = new CarLoan();

        do {
            System.out.println("Please select Loan Service Type");
            System.out.println("1. Personal Loan");
            System.out.println("2. Student Loan");
            System.out.println("3. Car Loan");

            if (sc.hasNextInt() == true) {
                userChoice = sc.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.println("Welcome to ABC Credit Union's Personal Loan Service");
                        System.out.print("How many times have you requested to take out loan from ABC Credit union (Annual Maximum Loan request can be 4 times)? ");
                        loanRequestFrequency = sc.nextInt();
//                       Biz Logic: ABC Credit union only provides max 4 times personal loan service a year
                        if (myPersonalLoan.personalLoanRequestFrequency(loanRequestFrequency) == true) {
                            System.out.print("Please enter your annual Income: EUR ");
                            annualIncome = sc.nextDouble();
                            System.out.print("Please enter required Personal Loan Amount: EUR ");
                            amountRequested = sc.nextDouble();
                            if (myPersonalLoan.annualIncomeAndRequestedLoan(annualIncome, amountRequested) == false) {
                                System.out.println("Your requested Loan amount can't exceed your annual Income!");
                            } else {
                                myPersonalLoan.setAmountRequested(amountRequested);
                                myPersonalLoan.setApplicantUniqueCode(userUniqueCode);
                                System.out.print("Repayment Period (Personal Loan Repayment period can't exceed more than 24 months): ");
//                       Biz Logic: Personal Loan Repayment period can't exceed more than 24 months 
                                repaymentPeriod = sc.nextInt();
                                if (myPersonalLoan.personalLoanRepaymentPeriod(repaymentPeriod) == true) {
                                    myPersonalLoan.setrepaymentPeriod(repaymentPeriod);
                                    myPersonalLoan.calculatePersonalLoan(repaymentPeriod, amountRequested);
                                    System.out.println("Your Personal Loan Request detail is as follow: " + myPersonalLoan.toString());
                                } else {
                                    System.out.println("Please enter valid range of months!");
                                }
                            }
                        } else {
                            System.out.println("You can't use loan service more than 4 times in a year!");
                        }
                        break;

                    case 2:
                        System.out.println("Welcome to ABC Credit Union's Student Loan Service");
                        System.out.print("Please enter your age: ");
                        userAge = sc.nextInt();
//                       Biz Logic: Student Loan service is only availiable for those whose age 19-24 years
                        if (myStudentLoan.ageLimitationForStudentLoan(userAge) == false) {
                            System.out.println("Student Loan is only available for people from the age of 19-24 ");
                        } else {
                            System.out.print("Please enter required Student Loan Amount: EUR ");
                            amountRequested = sc.nextDouble();
                            myStudentLoan.setAmountRequested(amountRequested);
                            myStudentLoan.setApplicantUniqueCode(userUniqueCode);

//                       Biz Logic: Student Loan Repayment period can't exceed more than 48 months 
                            System.out.print("Repayment Period (by Month): ");
                            repaymentPeriod = sc.nextInt();
                            if (myStudentLoan.studentLoanRepaymentPeriod(repaymentPeriod) == true) {
                                myStudentLoan.setrepaymentPeriod(repaymentPeriod);
                                myStudentLoan.calculateStudentLoan(repaymentPeriod, amountRequested);
                                System.out.println("Your Student Loan Request detail is as follow: " + myStudentLoan.toString());
                            } else {
                                System.out.println("Repayment period for Student Loan can't exceed 48 months!");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Welcome to ABC Credit Union's Car Loan Service");
                        System.out.println("Vehicle ownership? OWN or RENT");
                        userCarOwnership = sc.next();
                        if ("own".equalsIgnoreCase(userCarOwnership)) {
                            System.out.println("You should visit our branch to use Car Loan Service to purchase privately-owned car");
                            break;
                        } else {
                            System.out.print("Please enter required Car Loan Amount: EUR ");
                            amountRequested = sc.nextDouble();
                            myCarLoan.setAmountRequested(amountRequested);
                            myCarLoan.setApplicantUniqueCode(userUniqueCode);
                            System.out.print("Repayment Period (by Month): ");
//                       Biz Logic: Car Loan Repayment period can't exceed more than 19 months 
                                repaymentPeriod = sc.nextInt();
                            if (myCarLoan.carLoanRepaymentPeriod(repaymentPeriod)== true) {
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
            } else {
                System.out.println("Please choose valid range of options among 1-3!");
            }

            System.out.println("You want to continue? Yes or No?");
            userContinue = sc.next();
        } while (userContinueMethod(userContinue)== true);
        System.out.println(
                "Thank for using our ABC credit union service!");
        System.exit(
                0);
    }

    public boolean userUniqueCodeMethod(String userUniqueCode) {
        return Pattern.matches("[a-zA-Z]{5}[0-9]{3}", userUniqueCode);
    }

    public boolean userContinueMethod(String userContinue) {
        return "Yes".equalsIgnoreCase(userContinue);
    }
}
