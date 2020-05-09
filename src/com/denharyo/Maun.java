package com.denharyo;

public class Maun {
    // how to create instance of static
    // and non-static nested class
    // tambah comment juga di github

    public static void main (String [] args){

        // create instance of static nested-class
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();

        // call non-static method of nested static-class
        printer.printMessage();

        // in order to create instance of inner class we need an outer class instance
        // let us create an outer class instance of creating non-static nested class

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        // calling non-static method of inner-class
        inner.display();

        // we can also combine steps above into one step to create instance of inner class
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();

        // similarly we can call the method of inner-class
        innerObject.display();

    }

}
