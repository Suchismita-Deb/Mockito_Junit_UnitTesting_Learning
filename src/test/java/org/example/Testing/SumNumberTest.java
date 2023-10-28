package org.example.Testing;

import org.example.businessLogic.SumNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumNumberTest {
    @Test
    public void addNumberTest(){
        SumNumber sumNumber = new SumNumber();
        int res = sumNumber.addNumber(1,2);
        assertEquals(3,res);

        // For checking negative numbers
        int res1 = sumNumber.addNumber(-2,-3);
        assertEquals(-5,res1);

        // For checking one negative numbers
        int res2 = sumNumber.addNumber(-1,0);
        assertEquals(-1,res2);

        // For checking 0.
        int res3 = sumNumber.addNumber(0,0);
        assertEquals(0,res3);

        //For other method.
        int res4 = sumNumber.addNumber(0,0,1);
        assertEquals(1,res4);
    }
}
