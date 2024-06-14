package com.lanfq.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Method {
    private static final Logger log = LoggerFactory.getLogger(Method.class);
    public void testmethod(){
        Fruit fruit =  staticmethod();
        Total t = new Total();
        Double dou =  t.calculate(fruit);
        System.out.println(dou);
    }
    public void testmethod1(){
        Fruit fruit =  staticmethod();
        Total t = new Total();
        Double dou =  t.calculateDiscounts(fruit);
        System.out.println(dou);
    }
    public void testmethod2(){
        Fruit fruit =  staticmethod();
        Total t = new Total();
        Double dou =  t.calculateFull(fruit);
        System.out.println(dou);
    }
    public static Fruit staticmethod(){
        Fruit fruit = new Fruit();
        System.out.println("请输入你要购买的水果斤数用逗号隔开！");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            String[] str = s.split(",");
            for (int i = 0; i < str.length; i++) {
                Integer applep = Integer.parseInt(str[0]);
                if (!applep.equals("")|| applep!=null||applep>=0){
                    fruit.setAppleCatty(applep);
                }
                if (str.length>=2) {
                    Integer strawberry = Integer.parseInt(str[1]);
                    if (!strawberry.equals("")|| strawberry!=null||strawberry>=0){
                        fruit.setStrawberryCatty(strawberry);
                    }
                    if (str.length==3) {
                        Integer mango = Integer.parseInt(str[2]);
                        if (!mango.equals("")|| mango!=null||mango>=0){
                            fruit.setMangoCatty(mango);
                        }
                    }
                }
            }
        }else {
            log.info("请检查入参是否有误！");
        }
        return fruit;
    }
}
