package com.effectivejava.tutorial.effectivejava.Chapter2and3_CommonMethodsToAllObjects.item13_toString;

public class ItemThirteenTest {

    public static void main(String[] args) {

        // Shallow Copy
        Stack st = new Stack();
        Stack st1 = st;

        System.out.println(st == st1);


        // Deep Copy
        Stack stc = new Stack();
        stc.stackName = "furkan";

        Stack stc2 = new Stack();
        stc2.stackName = stc.stackName;

    }
}