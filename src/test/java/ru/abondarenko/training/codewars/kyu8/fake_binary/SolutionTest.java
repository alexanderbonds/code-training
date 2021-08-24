package ru.abondarenko.training.codewars.kyu8.fake_binary;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSomething() {
        Assert.assertEquals("0000011111", FakeBinary.fakeBin("0123456789"));
    }
}
