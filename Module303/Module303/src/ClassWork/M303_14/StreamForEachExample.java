package ClassWork.M303_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamForEachExample {

    public static void main(String[] args) {

        String[] strArray = {"one", "two", "three", "four", "five"};
        List<String> list = Arrays.asList(strArray);

        // called a lambda expression
        // in one line of code we are going to loop over the entire list and print all elements to upper case
        list.stream().forEach(e -> {
            // could have many lines of code in here
            System.out.println(e.toUpperCase());
        });

        // how you will most often see it
        list.stream().forEach(e -> {System.out.println(e.toUpperCase());});
        // these 2 lines are the same .. not sure what the subtle difference is...not if it matters
        list.forEach(anything -> System.out.println(anything.toUpperCase()));


        // super nice fast way of removing an item from a list in one line of code
        // list.removeIf(e -> e.startsWith("o"));

        System.out.println("*******************************");

        // primary use for this filter is when your trying to fins something in a list of entities
        // this stream did not affect the original list

        // List<String> filteredList = list.stream().filter(e -> e.startsWith("o")).collect(Collectors.toList());
        // filteredList.stream().forEach(a -> System.out.println(a));

        List<String> filteredList = list.stream().filter(e -> !e.startsWith("o")).collect(Collectors.toList());

        // same thing as above
        List<String> filteredList2 = list.stream().filter(e -> !e.startsWith("o")).toList();

        // note that we can chain this together to do 2 filters
        //
        List<String> filteredList1 = list.stream()
                .filter(e -> !e.startsWith("o"))
                .filter(e -> !e.startsWith("f"))
                .collect(Collectors.toList());

        // loop over the filtered list and print elements
        filteredList1.stream().forEach(e -> {System.out.println(e.toUpperCase());});

    }
}
