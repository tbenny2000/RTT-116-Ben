package ClassWork.M303_11;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {

        // basically the type b/w <> is the only type allowed into the list
        List<String> strings = new ArrayList<String>();
        strings.add("String1");
        // strings.add(1);

        // this will only allow integers to be in the list
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        //ints.add("String2");
    }
}
