package com.effectivejava.tutorial.effectivejava.Chapter1_Object.item7_MemoryManagement;

import org.springframework.web.bind.annotation.GetMapping;

public class ItemSevenTest3 {

    @GetMapping("/hello3")
    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 1; i < 10000000; i++) {
            stack.push(i);
        }

        for (int i = 1; i < 10000000; i++) {
            stack.popWell();
        }

        System.out.println("hello");

    }
}
