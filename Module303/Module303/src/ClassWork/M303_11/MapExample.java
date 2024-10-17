package ClassWork.M303_11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // this creat a new hash map where the key is of the type string and the value is of type integer
        Map<String, Integer> numbers = new HashMap<>();

        // we can put thing into the map. The first argument is the key and the second is the value
        // the value can be a duplicate but the key can not
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("ten", 10);
        numbers.put("tenn", 10);
        // when i set the same key value
        numbers.put("ten", 100);

        // to erase a value this will leave the key in the hashmap but will set the value of that key to null or nothing
        // this happens from time to time
        // in a way this is setting the value to empty. However it is not deleting the key from keySet
        numbers.put("one", null);

        // to remove a key and value form the hashmap we can use the remove function
        numbers.remove("tenn");

        // we are asking the map for a key that does not exist, it will return null meaning not existing
        // the get method returns nul when not found
        Integer notFound = numbers.get("thousand");
        System.out.println("not found == " + notFound);

        // we can retrieve things from the maps using the key
        Integer x = numbers.get("ten"); // this will return the Integer 1
        Integer x2 = numbers.get("ten"); // this will return the Interger 2


        // we can also loop over the hashmap similar to how we could loop over a list
        // first we need to get the set of all keys in the map
        // the method to get the set of keys from the map is called keySet();
        // we do not know the order the keySet will return in.. not guaranteed
        // !!!!!!!   IMPORTANT TO KNOW AND UNDERSTAND LOPPING OVER THE KEYS TO GET THE VALUES
        // !!!!!!!   THIS GETS DONE A LOT.
        for ( String key : numbers.keySet() ) {
            Integer value = numbers.get(key);
            System.out.println(key + " == " + value);
        }

        // we can also loop over the values in the hashmap
        for (Integer i : numbers.values()) {
            // with this technique we do not know which key belongs with which value.. just the value themselves.
            System.out.println(i);
        }
    }
}
