package ru.happyshark.training.codewars.kyu8.beginner_series_4_cockroach;

public class Cockroach {

//    https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6
//
//    The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second,
//    rounded down to the integer (= floored).
//
//    For example:
//
//    cockroachSpeed(1.08) == 30
//    Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
//
//    Typecasting: https://www.educative.io/edpresso/how-to-convert-a-double-to-int-in-java

    public int cockroachSpeed(double x){
        return (int) (x * 100_000 / 3600);
    }
}
