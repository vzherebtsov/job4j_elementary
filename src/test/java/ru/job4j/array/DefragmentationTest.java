package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class DefragmentationTest {

    @Test
    public void singleFirstNull() {
        String[] input = {null, "I"};
        String[] result = Defragmentation.compress(input);
        String[] expected = {"I", null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] result = Defragmentation.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] result = Defragmentation.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notAllNull() {
        String[] input = {null, null, null};
        String[] result = Defragmentation.compress(input);
        String[] expected = {null, null, null};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void notAllAtFirstNull() {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] result = Defragmentation.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        Assert.assertArrayEquals(expected, result);
    }
}