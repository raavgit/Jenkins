package org.softech.interview;


import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFrequency {
    @Test
    public  void findUniqueCharacters() {
        String name="padmanabharao";
        IntStream intStream=name.chars();
        //intStream.forEach(x->System.out.println(x));

       Stream<Character> characterStream = intStream.mapToObj(e->(char)e);
       //characterStream.forEach(x->System.out.println(x));

        Map<Character,Long> map=characterStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }

    @Test
    public void findUniqueCharacters001() {
        String name = "padmanabharao";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {
            Character ch = name.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }

    @Test
    void printCharctersFromString(){
        String name= "padmanabharao";
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }

    @Test
    public void countNamesList(){
        List<String> names =List.of("Rao","Uma","Rao","Asrith","Uma","Rao");
         Map<String,Integer> map=new HashMap<>();

         for(int i=0;i<names.size();i++){
             String nameString=names.get(i);
             //System.out.println(nameString);
             if(map.containsKey(nameString)){
                 map.put(nameString,map.get(nameString)+1);
             }else{
                 map.put(nameString,1);
             }

    }
       System.out.println(map);
    }

    @Test
    public void countNamesArray(){
        String[] names ={"Rao","Uma","Rao","Asrith","Uma","Rao"};

        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<names.length;i++){
            String nameString=names[i];
            //System.out.println(nameString);
            if(map.containsKey(nameString)){
                map.put(nameString,map.get(nameString)+1);
            }else{
                map.put(nameString,1);
            }

        }
        System.out.println(map);
    }
}
