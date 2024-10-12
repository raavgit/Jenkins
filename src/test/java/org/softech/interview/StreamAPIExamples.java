package org.softech.interview;

import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Write a Java 8 program to find the words starting with Vowels using Stream API
 */
public class StreamAPIExamples {

   List<String> words1= List.of("apples","eggs","bananas","Fries","oranges");
    Function<String,String> function= (word)->word.toLowerCase();
    Predicate<String> wordsStartWithConsonants =(word)-> word.charAt(0)!='a'
            && word.charAt(0)!='e'
            && word.charAt(0)!='i'
            && word.charAt(0)!='o'
            && word.charAt(0)!='u';


    @Test
    public void listOfWords(){
        listOfWordsStartingWithVowels(words1);
        listOfWordsStartingWithConsonants(words1);
    }

    public void listOfWordsStartingWithVowels(List<String> words){

        List<String> listOfWordsStartingWithVowels =
                words.stream().
                        map(givenWords-> givenWords.toLowerCase())
                        .filter(word->word.charAt(0)=='a'
                        ||word.charAt(0)=='e'
                        ||word.charAt(0)=='i'
                        ||word.charAt(0)=='o'
                        ||word.charAt(0)=='u')
                        .collect(Collectors.toList());
        System.out.println(listOfWordsStartingWithVowels);

    }


    public void listOfWordsStartingWithConsonants(List<String> words){

          List<String> listOfWordsNotStartingWithVowels =  words.stream().map(function).filter(wordsStartWithConsonants).collect(Collectors.toList());
        System.out.println(listOfWordsNotStartingWithVowels);

    }

}
