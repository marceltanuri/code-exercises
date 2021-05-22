package com.mtanuri.misc;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EasyMode {

    //Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
    public static Integer sumMultiplesOfThreeAndFive
            (Integer n) {
        return IntStream.range(1, n+1).filter(x -> x % 3 == 0 || x % 5 == 0).sum();
    }

    //Write a method that calculates the factorial of a given number.
    //Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
    public static Integer factorial(Integer n){
        return IntStream.range(1,n+1).reduce(1, (int a, int b) -> a * b);
    }

    //Write a method that returns the index of the first occurrence of given integer in a list.
    //Assume that the index of the first element in the list is zero.
    //If the number does not exist return -1.
    public static Integer linearSearch(Integer i, Integer... list) {
        return Arrays.asList(list).indexOf(i);
    }

    //Write a method that reverses a string.
    //For example, 'java interview' becomes 'weivretni avaj'.
    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    //Write a method that returns the largest integer in the list.
    //You can assume that the list has at least one element.
    public static Integer findMaximum(int ... values) {
        OptionalInt optionalInt = IntStream.of(values).max();
        if(optionalInt.isPresent()){
            return optionalInt.getAsInt();
        }
        return 0;
    }


    //Write a method that returns the average of a list of integers.
    public static Double averageValueStreams(int  ...values) {
        return IntStream.of(values).average().getAsDouble();
    }

    //Write a method that converts all strings in a list to their upper case.
    public static List<String> convertToUpperCaseStreams(String ... abc) {
        return Stream.of(abc).map(String::toUpperCase).collect(Collectors.toList());
    }
}

//examples found at: https://code-exercises.com/programming
