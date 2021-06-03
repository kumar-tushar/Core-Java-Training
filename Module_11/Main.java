package Module_11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<Integer, String> namesMap=new HashMap<>();
        namesMap.put(2, "Kumar");
        namesMap.put(43, "Robert");
        namesMap.put(13, "Rahul");

        String name=namesMap.get(43);
        System.out.println(name);

        namesMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
