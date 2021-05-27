package Module_7;

public class Main {

    public static void main(String[] args){

    }
}

abstract class Animal{
    public void run(){
        System.out.println("Animal Running");
    }
    abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Dog Eating");
    }

}