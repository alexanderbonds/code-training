package ru.abondarenko.training.codewars.kyu8.transportation_on_vacation;

public class Kata {

//    https://www.codewars.com/kata/568d0dd208ee69389d000016
//
//    After a hard quarter in the office you decide to get some rest on a vacation.
//    So you will book a flight for you and your girlfriend and try to leave all the mess behind you.
//
//    You will need a rental car in order for you to get around in your vacation.
//    The manager of the car rental makes you some good offers.
//
//    Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total.
//    Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
//
//    Write a code that gives out the total amount for different days(d).

    private static final int DAILY_PRICE = 40;
    private static final int WEEKLY_DISCOUNT = 50;
    private static final int THREE_DAY_DISCOUNT = 20;

    public static int rentalCarCost(int d) {
        if (d >= 7) {
            return d * DAILY_PRICE - WEEKLY_DISCOUNT;
        }
        if (d >= 3) {
            return d * DAILY_PRICE - THREE_DAY_DISCOUNT;
        }
        return d * DAILY_PRICE;
    }
}
