package org.softech.interview;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
How to reverse each word in a string using java8
*/
public class ReverseEachWord {
@Test
    public void reverseEachWordInStringArray(){
    String inputString="My name is Rao Pedapatnapu";

    //String[] words=inputString.split(" ");
   // System.out.println(inputString);

    String[] words=inputString.split(" ");

    List<String>  reversedWords= Arrays.stream(words)
            .map((word)->new StringBuilder(word).reverse().toString())
            .collect(Collectors.toList());

    System.out.println(reversedWords);

}

    @Test
    public void reverseEachWordInStringList(){
        String inputString="My name is Rao Pedapatnapu";

        List<String> stringList= List.of(inputString.split(" "));
        System.out.println(stringList);

        List<String> reversedWords1=stringList.stream().map((word)->new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(reversedWords1);



    }

}
