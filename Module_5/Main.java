package Module_5;

public class Main {

    public static void main(String[] args){
        Dog dog=new Dog();
        dog.run();

    }
}


class Animal{
    public void run(){
        System.out.println("Animal Running");
    }
}


class Dog extends Animal {
    public void run(){
        System.out.println("Dog Running");
    }

}


