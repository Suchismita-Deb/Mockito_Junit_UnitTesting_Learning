package org.example.Testing;

import org.example.businessLogic.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
  Multiplication multiplication = new Multiplication();
  @Test
  void mulNumber() {
    Integer res = multiplication.mulNumber(1,2);
    assertEquals(2,res);

    //For null value as first number.
    assertThrows(IllegalArgumentException.class, () -> multiplication.mulNumber(null,2));
    //For null value as second number.
    assertThrows(IllegalArgumentException.class, () -> multiplication.mulNumber(3,null));
    //For null value as both number.
    assertThrows(IllegalArgumentException.class, () -> multiplication.mulNumber(null,null));
  }

  @Test
  public void maxIntRangeTest(){
    assertThrows(NumberFormatException.class,()->multiplication.mulNumber(Integer.MAX_VALUE,2));
    assertEquals(0,multiplication.mulNumber(Integer.MAX_VALUE,0));
    assertEquals(Integer.MAX_VALUE,multiplication.mulNumber(Integer.MAX_VALUE,1));
  }
}
