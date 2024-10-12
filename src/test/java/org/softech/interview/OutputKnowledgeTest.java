package org.softech.interview;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OutputKnowledgeTest {

    @Test
    public  void prediacteExample001() {
        Predicate<String> nullCheck= arg->arg!=null;
        Predicate<String> emptyCheck =arg->arg.length()>0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
        System.out.println(nullAndEmptyCheck.test(null));

        System.out.println(nullAndEmptyCheck.test("Rao"));
    }

    @Test
    public void findMaxUsingComparartor(){
        List<Integer> numbers= Arrays.asList(80,20,100,40,70,60);
        int max= numbers.stream().max(Comparator.naturalOrder())
                .get();
        System.out.println("Maximum value is " +max);

        List<Integer> ascendingOrderList =
                numbers.stream().sorted(Comparator.naturalOrder())
                        .collect(Collectors.toList());
        System.out.println(ascendingOrderList);

        List<Integer> reversedList=
                numbers.stream().sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
        System.out.println(reversedList);

    }
}
