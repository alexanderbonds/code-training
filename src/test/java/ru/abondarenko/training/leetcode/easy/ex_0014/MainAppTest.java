package ru.abondarenko.training.leetcode.easy.ex_0014;

import org.junit.Assert;
import org.junit.Test;

public class MainAppTest {
    @Test
    public void test() {
        Assert.assertEquals("fl", MainApp.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", MainApp.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
