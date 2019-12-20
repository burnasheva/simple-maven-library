package com.test;

public abstract class DslLibrary {
    public static String format(String toFormat) {
        return toFormat + "!!";
    }

    public static String toUpperCase(String toFormat) {
        return toFormat.toUpperCase();
    }
}
