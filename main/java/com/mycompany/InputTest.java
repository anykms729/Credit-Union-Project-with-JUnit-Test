/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.*;
import java.util.regex.Pattern;

public class InputTest {

    static Scanner sc = new Scanner(System.in);
    static Object InputObj;
    static Object inputClass;
    static String userUniqueCode;
    static int userMonth;
    static String userMonthInString;
    static int repaymentPeriod;
    static String userContinue;

    public static void main(String[] args) {
        System.out.println("Repayment Period");
        do {
            while (sc.hasNextInt()) {
                repaymentPeriod = sc.nextInt();

                String repaymentPeriodString = String.valueOf(repaymentPeriod);
                if (Pattern.matches("[0-9]{2}", repaymentPeriodString)) {
                    System.out.println("Next Step");
                } else {
                    System.out.println("Only 2 digits month");
                }
            }
            System.out.println("Invalid input format");
            System.out.println("Continue? Yes or Not");
            userContinue = sc.nextLine();
        } while (userContinue == "Yes");

    }

//            System.out.print("Please enter  ID consist of 5 characters + 3 numbers: ");
//            userUniqueCode = sc.next();
//            System.out.println(Pattern.matches("[a-zA-Z]{5}[0-9]{3}", userUniqueCode));
//            System.out.print("Please enter Month: ");
//            userMonth = sc.nextInt();
//            userMonthInString = String.valueOf(userMonth);
//            System.out.println(Pattern.matches("[0-9]{1,}", userMonthInString));
    //        try {
    //            System.out.print("Enter an alphabet, only an alphabet: ");
    //            InputObj = sc.nextInt();
    //            inputClass = sc.getClass();
    //            
    //            System.out.println(inputClass);
    //            System.out.println("");
    //        } catch (InputMismatchException e) {
    //            System.out.println("Input type mismatched! Please enter valid format Input");
    //        }
}
