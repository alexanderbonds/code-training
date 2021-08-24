package ru.abondarenko.training.leetcode.medium.ex_0011;

import org.junit.Assert;
import org.junit.Test;
import ru.abondarenko.training.leetcode.meduim.ex_0011.MainApp;

public class MainAppTest {
    @Test
    public void maxAreaTest() {
        Assert.assertEquals(49, MainApp.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(12, MainApp.maxArea(new int[] {4, 3, 2, 4, 1}));
        Assert.assertEquals(2, MainApp.maxArea(new int[] {1, 2, 1}));
    }

    @Test
    public void maxAreaOptimizedTest() {
        Assert.assertEquals(49, MainApp.maxAreaOptimize(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(12, MainApp.maxAreaOptimize(new int[] {4, 3, 2, 4, 1}));
        Assert.assertEquals(2, MainApp.maxAreaOptimize(new int[] {1, 2, 1}));
    }
}
