package org.example.businessLogic;

public class Multiplication {
    public Integer mulNumber(Integer a, Integer b){
      if (null == a || null == b)
          throw new IllegalArgumentException("Number cannot be Null.");
      if((long)a*b>Integer.MAX_VALUE)
          throw new NumberFormatException("Number exceeded the Integer range.");
      return a*b;
    }
}
