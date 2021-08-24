package ru.abondarenko.training.leetcode.easy.ex_0001;

import org.junit.Assert;
import org.junit.Test;

public class MainAppTest {
    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{0, 1}, MainApp.twoSumOptimal(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{1, 2}, MainApp.twoSumOptimal(new int[]{3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[]{0, 1}, MainApp.twoSumOptimal(new int[]{3, 3}, 6));
    }
}
