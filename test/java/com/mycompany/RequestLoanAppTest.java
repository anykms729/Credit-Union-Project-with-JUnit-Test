/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

public class RequestLoanAppTest {
     @Test
     @DisplayName("Check user unique code aviliability")
     public void userUniqueCodeMethodTest(){
        var requestLoanApp = new RequestLoanApp();
        assertTrue(requestLoanApp.userUniqueCodeMethod("abcde"),()->"User Unique Code Method Test failed!");
    }

     @Test
     @DisplayName("Check continue App or Exit")
     public void userContinueMethodTest(){
        var requestLoanApp = new RequestLoanApp();
        assertTrue(requestLoanApp.userContinueMethod("Yes"),()->"User Continue Method Test failed!");
    }
     
//     @Test
//     @DisplayName("User Choice range from 1 to 3")
//     public void userChoiceListTest(){
//         var requestLoanApp = new RequestLoanApp();
//         assertArrayEquals(requestLoanApp.u)
//     }
}

