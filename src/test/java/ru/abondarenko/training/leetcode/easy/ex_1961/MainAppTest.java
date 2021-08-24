package ru.abondarenko.training.leetcode.easy.ex_1961;

import org.junit.Assert;
import org.junit.Test;

public class MainAppTest {
    @Test
    public void test() {
        Assert.assertEquals(true, MainApp.isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
        Assert.assertEquals(false, MainApp.isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
    }
}
