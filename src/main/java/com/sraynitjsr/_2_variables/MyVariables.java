package com.sraynitjsr._2_variables;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MyVariables {
    public static void start() {
        System.out.println("**** Inside Variables Module ****");

        byte myByte = 127;
        short myShort = 32000;
        int myInt = 100000;
        long myLong = 10000000000L;
        float myFloat = 10.5f;
        double myDouble = 99.99;
        char myChar = 'J';
        boolean myBoolean = true;
        String myString = "Hello Java";

        BigInteger myBigInteger = new BigInteger("12345678901234567890");
        BigDecimal myBigDecimal = new BigDecimal("12345.678901234567890");

        System.out.println("byte: " + myByte + " (Size: " + Byte.BYTES + " byte, " + (Byte.BYTES * 8) + " bits)");
        System.out.println("short: " + myShort + " (Size: " + Short.BYTES + " bytes, " + (Short.BYTES * 8) + " bits)");
        System.out.println("int: " + myInt + " (Size: " + Integer.BYTES + " bytes, " + (Integer.BYTES * 8) + " bits)");
        System.out.println("long: " + myLong + " (Size: " + Long.BYTES + " bytes, " + (Long.BYTES * 8) + " bits)");
        System.out.println("float: " + myFloat + " (Size: " + Float.BYTES + " bytes, " + (Float.BYTES * 8) + " bits)");
        System.out.println("double: " + myDouble + " (Size: " + Double.BYTES + " bytes, " + (Double.BYTES * 8) + " bits)");
        System.out.println("char: " + myChar + " (Size: " + Character.BYTES + " bytes, " + (Character.BYTES * 8) + " bits)");
        System.out.println("boolean: " + myBoolean + " (Size: JVM dependent)");
        System.out.println("String: " + myString + " (Size: Varies)");
        System.out.println("BigInteger: " + myBigInteger + " (Size: Varies)");
        System.out.println("BigDecimal: " + myBigDecimal + " (Size: Varies)");
    }
}
