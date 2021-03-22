package ru.happyshark.training.codewars.kyu8.fake_binary;

public class FakeBinary {

//    https://www.codewars.com/kata/57eae65a4321032ce000002d
//
//    Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.

    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();
        String[] stringArr = numberString.split("");
        for (int i = 0; i < stringArr.length; i++) {
            if (Integer.parseInt(stringArr[i]) < 5) {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }
        return sb.toString();
    }

    public static String anotherSolution(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
