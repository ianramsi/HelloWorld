package com.denharyo;

public class OuterClass {
    private static String msg = " Message from You!";

    //static nested class
    public static class NestedStaticClass {
        // only static member of outer class is directly accessible in nested static class

        public void printMessage(){
            // Try making 'message' non-static variable  will make compile error
            System.out.println("Message from static nested-class "  + msg);

        }
    }




    // non-static nested class also called inner class
    public class InnerClass {
        //both static and non-static members of outer class are accessible in this Inner class

        public void display (){
            System.out.println("Message from non-static  nested class " + msg);
        }
    }
}
