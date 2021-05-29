package Module_10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> nameList=new ArrayList<>();
        nameList.add("Sam");
        nameList.add("Rahul");
        nameList.add("Monika");
        nameList.add("Tony");

        for(String name:nameList){
            System.out.println(name);
        }
    }
}
