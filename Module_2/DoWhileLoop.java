package Module_2;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        int count=0;
        do{
            System.out.println(count);
            count++;
        }while(count<=10);

        System.out.println();

        Scanner scanner=new Scanner(System.in);
        double number;
        double sum=0;
        do{
            System.out.println("Enter a Number: ");
            number=scanner.nextDouble();
            sum+=number;
        }while(number!=0);
        System.out.println(sum);
    }
}
