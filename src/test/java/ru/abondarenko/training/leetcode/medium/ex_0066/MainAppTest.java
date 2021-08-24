package ru.abondarenko.training.leetcode.medium.ex_0066;

import org.junit.Assert;
import org.junit.Test;
import ru.abondarenko.training.leetcode.meduim.ex_0066.MainApp;

public class MainAppTest {
    @Test
    public void plusOneTest() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 9},
                MainApp.plusOne(new int[]{1, 2, 3, 4, 5, 6, 8}));

        Assert.assertArrayEquals(new int[]{1, 2, 3, 5, 0, 0, 0, 0, 0},
                MainApp.plusOne(new int[]{1, 2, 3, 4, 9, 9, 9, 9, 9}));

        Assert.assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                MainApp.plusOne(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9}));

        Assert.assertArrayEquals(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9 , 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7},
                MainApp.plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1,1, 7, 4, 0, 0, 6}));
    }
}
