package ru.itmo.java;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    @Test
    public void testGet() {
        Task1 task1 = new Task1();
        Assert.assertEquals(27, task1.get());
    }
}