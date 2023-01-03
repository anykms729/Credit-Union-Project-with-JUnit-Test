
package com.mycompany;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;

public class RequestLoanAppTest {
     @Test
     @DisplayName("Check user unique code aviliability")
     public void userUniqueCodeMethodTest(){
        var requestLoanApp = new RequestLoanApp();
        assertTrue(requestLoanApp.userUniqueCodeMethod("abcde123"),()->{
            return "User Unique Code Method Test failed!";
        }
        );
    }

     @Test
     @DisplayName("Check continue App or Exit")
     public void userContinueMethodTest(){
        var requestLoanApp = new RequestLoanApp();
        assertTrue(requestLoanApp.userContinueMethod("Yes"),()->"User Continue Method Test failed!");
    } 
}

