package Module_1;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter score:");
        int score=scan.nextInt();

        char grade;

        if(score>=90){
            grade='A';
        }
        else if(score>=80){
            grade='B';
        }
        else if(score>=70){
            grade='C';
        }
        else if(score>=60){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("Grade: " + grade);

        switch (grade){
            case 'A':
            {
                System.out.println("Excellent Score");
                break;
            }
            case 'B':
            {
                System.out.println("Very Good Score");
                break;
            }
            case 'C':
            {
                System.out.println("Good Score");
                break;
            }
            case 'D':
            {
                System.out.println("Average Score");
                break;
            }
            case 'F':
            {
                System.out.println("Failed");
            }
            default:{
                System.out.println("Invalid");
            }
        }
    }
}
