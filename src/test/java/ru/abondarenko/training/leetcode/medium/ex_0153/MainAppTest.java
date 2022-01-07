package ru.abondarenko.training.leetcode.medium.ex_0153;

import org.junit.Assert;
import org.junit.Test;
import ru.abondarenko.training.leetcode.meduim.ex_0153.MainApp;

public class MainAppTest {
    @Test
    public void findMinTest() {
        Assert.assertEquals(1, MainApp.findMin(new int[] {2,3,1}));
        Assert.assertEquals(1, MainApp.findMin(new int[] {3,4,5,1,2}));
        Assert.assertEquals(0, MainApp.findMin(new int[] {4,5,6,7,0,1,2}));
        Assert.assertEquals(11, MainApp.findMin(new int[] {11,13,15,17}));
    }
}
