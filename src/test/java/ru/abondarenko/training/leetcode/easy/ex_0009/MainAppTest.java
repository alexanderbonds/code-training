package ru.abondarenko.training.leetcode.easy.ex_0009;

import org.junit.Assert;
import org.junit.Test;

public class MainAppTest {
    @Test
    public void test() {
        Assert.assertTrue(MainApp.isPalindrome(121));
        Assert.assertFalse(MainApp.isPalindrome(-121));
        Assert.assertFalse(MainApp.isPalindrome(10));
        Assert.assertFalse(MainApp.isPalindrome(-101));
    }
}
