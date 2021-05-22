package com.mtanuri.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTraining {

    public static Collection<String> mapToUppercase(String... names) {
        return Stream.of(names).map(x -> x.toUpperCase()).collect(Collectors.toList());
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Stream.of(names).filter(x -> x.length()>5).mapToInt(x -> x.length()).sum();
    }

    public static List<String> transform(List<List<String>> collection) {
        return collection.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
    }

}
