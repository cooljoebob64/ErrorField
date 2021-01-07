package com.tts;

public class Main {

    public static void main(String[] args) {


        // illegal field names
//        int int = 1; // int is a reserved word
//        double class = 10.0;  // class is a reserved word
//        String void = "wow this is void"; // void is a reserved word


        // uninitialized variables
        int dontInitializeMe;
//        System.out.println(dontInitializeMe);  // not initialized!

        String doIExist;
        {
            doIExist = "Yes I think so!";
        }
        System.out.println("Do I exist? " + doIExist); // this is fine!

        {
            String howAboutNow;
//            System.out.println("Do I exist now? " + howAboutNow); // not initialized
        }
//        System.out.println(howAboutNow);  // not initialized!
    }
}
