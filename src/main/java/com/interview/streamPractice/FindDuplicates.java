package com.interview.streamPractice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

    static void main(String[] args) {
        List<Integer> list=List.of(10,20,30,40,50,10,20);
        List<Integer> duplicates=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
