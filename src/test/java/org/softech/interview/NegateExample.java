package org.softech.interview;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NegateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("consumer","","predicate","function","","supplier");
        Predicate<String> emptyWords=String::isEmpty;
        long count=words.stream()
                .filter(emptyWords.negate())
                .count();
        System.out.println(count);
    }
}
