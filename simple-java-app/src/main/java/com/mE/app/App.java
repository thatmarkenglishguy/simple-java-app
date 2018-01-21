package com.mE.app;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String getMeAString(Supplier<String> func) {
        final String it = func.get();
        return it;
    }

    public static void main( String[] args )
    {
        final String someString = getMeAString(() -> "Hello World!");
        System.out.println(someString);
    }
}
