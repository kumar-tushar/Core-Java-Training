package Module_2;

public class ExceptionHandling {

    public static void main(String[] args){

        System.out.println("Program Starts");

        int[] myArray={3, 45, 8, 10};

        try{
            int result=myArray[1]/0;
            System.out.println(myArray[21]);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }

        try{
            String s=null;
            System.out.println(s.length());
        }catch(Exception e){
            System.out.println(e);
        }


        System.out.println("Program Ends");

    }
}
