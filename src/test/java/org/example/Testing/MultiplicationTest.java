package org.example.Testing;

import org.example.businessLogic.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
  Multiplication multiplication = new Multiplication();
  @Test
  void mulNumber() {
    int res = multiplication.mulNumber(1,2);
    assertEquals(2,res);
  }
}
