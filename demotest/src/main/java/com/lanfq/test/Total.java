package com.lanfq.test;

import java.math.BigDecimal;

public class Total {
    private Integer appleprice=8;
    private Integer strawberryprice=13;
    private Integer mangoprice=20;
    public Double calculate(Fruit fruit){
        return appleprice*fruit.getAppleCatty()
                +strawberryprice*fruit.getStrawberryCatty()*0.0
                +mangoprice*fruit.getMangoCatty();
    }
    public Double calculateDiscounts(Fruit fruit){
        return appleprice*fruit.getAppleCatty()
                +(strawberryprice*0.8)*fruit.getStrawberryCatty()
                +mangoprice*fruit.getMangoCatty();
    }
    public Double calculateFull(Fruit fruit){
        Double sum =  appleprice*fruit.getAppleCatty()
                +(strawberryprice*0.8)*fruit.getStrawberryCatty()
                +mangoprice*fruit.getMangoCatty();
        if (sum>=100){
            sum = sum-10;
        }
        return sum;
    }
}
