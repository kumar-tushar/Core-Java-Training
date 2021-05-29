package Module_9;

public class Main {
    public static void main(String[] args){
        Employee.count=20;
        System.out.println(Employee.company);
        System.out.println(Employee.count);
    }
}

class Employee {
    public String name;
    public static final String company="Oracle";
    public static int count=0;

    public static void myFirstStaticMethod(){
        System.out.println("My First Static Method");
        System.out.println(count);
        test();
    }

    public static void test(){
        System.out.println("Testing");
    }




}
