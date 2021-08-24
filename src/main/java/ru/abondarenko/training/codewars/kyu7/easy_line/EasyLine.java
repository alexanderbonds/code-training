package ru.abondarenko.training.codewars.kyu7.easy_line;

import java.math.BigInteger;

public class EasyLine {

//    https://www.codewars.com/kata/56e7d40129035aed6c000632
//
//    In the drawing below we have a part of the Pascal's triangle, horizontal lines are numbered from zero (top).
//
//    We want to calculate the sum of the squares of the binomial coefficients on a given horizontal line with a function called easyline (or easyLine or easy-line).
//
//    Can you write a program which calculate easyline(n) where n is the horizontal line number?
//
//    The function will take n (with: n>= 0) as parameter and will return the sum of the squares of the binomial coefficients on line n.
//
//    Examples:
//    easyline(0) => 1
//    easyline(1) => 2
//    easyline(4) => 70
//    easyline(50) => 100891344545564193334812497256
//    Ref:
//    http://mathworld.wolfram.com/BinomialCoefficient.html
//
//              1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1
//    1   5   10  10  5   1
//

    public static BigInteger easyLine(int n) {
        BigInteger result = BigInteger.ZERO;
        for (int k = 0; k <= n; k++) {
            result = result.add(evalBinomialCoefficient(n, k).pow(2));
        }
        return result;
    }

    private static BigInteger evalBinomialCoefficient(long n, long k) {
        if (k <= n) {
            //                n!
            // C(n,k) = -------------
            //          k! * (n - k)!
            return evalFactorial(n).divide(evalFactorial(k).multiply(evalFactorial(n - k)));
        }
        return BigInteger.ZERO;
    }

    private static BigInteger evalFactorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
