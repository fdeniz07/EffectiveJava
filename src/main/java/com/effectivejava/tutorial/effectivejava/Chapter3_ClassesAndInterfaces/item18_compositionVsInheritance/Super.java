package com.effectivejava.tutorial.effectivejava.Chapter3_ClassesAndInterfaces.item18_compositionVsInheritance;

//Class whose constructor invokes an overridable method. NEVER DO THIS! (Page 95)
public class Super {
    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }

    public void overrideMe() {

    }
}
