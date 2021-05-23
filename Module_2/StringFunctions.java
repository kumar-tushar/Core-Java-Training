package Module_2;

public class StringFunctions {

    public static void main(String[] args){

        char[] myArray={'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        System.out.println(myArray);
        System.out.println(myArray.length);

        System.out.println();

        String firstString="welcome";
        String secondString="welcome";

        String thirdString=new String("welcome");
        System.out.println(thirdString);

        System.out.println();

        System.out.println(firstString==secondString);
        System.out.println(firstString==thirdString);
        System.out.println(firstString.equals(thirdString));

        System.out.println();

        System.out.println(firstString);
        System.out.println(firstString.length());

        System.out.println();

        System.out.println(firstString.charAt(0));

        System.out.println();

        System.out.println(firstString.toUpperCase());
        System.out.println(firstString.toLowerCase());



    }
}
