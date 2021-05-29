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

        nameList.remove(1);
        nameList.add(1,"Peter");
        nameList.set(1, "Rahul");

        nameList.remove("Monika");

        for(String name:nameList){
            System.out.println(name);
        }

        System.out.println();

        Employee e1=new Employee("Albert");
        Employee e2=new Employee("Alex");
        Employee e3=new Employee("Neha");


        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        for(Employee employee:employeeList){
            System.out.println(employee.name);
        }

    }
}


class Employee{
    String name;
    public Employee(String name){
        this.name=name;
    }
}