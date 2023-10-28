package org.example.businessLogic;

public class Multiplication {
    public Integer mulNumber(Integer a, Integer b){
        if(null==a || null==b)
            throw new IllegalArgumentException("Number cannot be Null.");
        return a*b;
    }
}
