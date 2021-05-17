package Module_1;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

        int x=10;
        int y=x--;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println();

        boolean isSecular=true;

        String message=isSecular?"India is secular": "India is not secular";
        System.out.println(message);

    }
}
