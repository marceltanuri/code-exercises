package com.mtanuri.misc.test;

import com.mtanuri.misc.EasyMode;
import org.assertj.core.util.Arrays;
import org.assertj.core.util.Streams;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EasyModeTest {

    @Test
    public void sumMultiplesOfThreeAndFiveTest(){
        Assert.assertEquals(Integer.valueOf(60), EasyMode.sumMultiplesOfThreeAndFive(16));
        Assert.assertEquals(Integer.valueOf(33), EasyMode.sumMultiplesOfThreeAndFive(10));
        Assert.assertEquals(Integer.valueOf(2843), EasyMode.sumMultiplesOfThreeAndFive(110));
    }

    @Test
    public void factorialTest(){
        Assert.assertEquals(Integer.valueOf(1), EasyMode.factorial(1));
        Assert.assertEquals(Integer.valueOf(24), EasyMode.factorial(4));
        Assert.assertEquals(Integer.valueOf(720), EasyMode.factorial(6));
        Assert.assertEquals(Integer.valueOf(40320), EasyMode.factorial(8));
    }

    @Test
    public void linearSearchTest(){
        Assert.assertEquals(Integer.valueOf(4), EasyMode.linearSearch(6, 3,1,3,2,6,9,7,6));
        Assert.assertEquals(Integer.valueOf(0), EasyMode.linearSearch(10, 10));
        Assert.assertEquals(Integer.valueOf(-1), EasyMode.linearSearch(10, 103,-110));
        Assert.assertEquals(Integer.valueOf(0), EasyMode.linearSearch(22, 22,22,22,22));

    }

    @Test
    public void reverseStringTest(){
        Assert.assertEquals("weivretni avaj", EasyMode.reverseString("java interview"));
    }

    @Test
    public void findMaximumTest(){
        Assert.assertEquals(Integer.valueOf(1), EasyMode.findMaximum(0, 1));
        Assert.assertEquals(Integer.valueOf(505), EasyMode.findMaximum(505, 10));
        Assert.assertEquals(Integer.valueOf(20), EasyMode.findMaximum(20, 20, 20));
        Assert.assertEquals(Integer.valueOf(2), EasyMode.findMaximum(2));
    }

    @Test
    public void averageValueStreamsTest(){
        Assert.assertEquals(Double.valueOf(0.5), EasyMode.averageValueStreams(0,1));
    }

    @Test
    public void convertToUpperCaseStreamsTest(){
        Assert.assertEquals(true, Stream.of("ABC", "BBB").collect(Collectors.toList()).containsAll(EasyMode.convertToUpperCaseStreams("abc", "bbb")));
        Assert.assertEquals(true, Stream.of("AB", "ABCD").collect(Collectors.toList()).containsAll(EasyMode.convertToUpperCaseStreams("ab", "abcd")));
        Assert.assertEquals(true, Stream.of("AAA").collect(Collectors.toList()).containsAll(EasyMode.convertToUpperCaseStreams("aaa")));
    }





}
