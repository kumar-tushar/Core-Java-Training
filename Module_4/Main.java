package Module_4;

public class Main {

    public static void main(String[] args){
        Dog dog=new Dog();
        dog.name="Labrador";
        dog.color="black";
        dog.bark();
        dog.run();
        System.out.println();

        Cat cat=new Cat();
        cat.name="Persian Cat";
        cat.pattern="tabby";
        cat.meow();
        cat.run();
        System.out.println();

        Puppy puppy=new Puppy();
        puppy.name="Santa";
        puppy.color="white";
        puppy.size="25";
        puppy.bark();
        puppy.run();
        puppy.sleep();
    }
}


class Animal{
    String name;
    public void run(){
        System.out.println(name+" Running");
    }
}


class Dog extends Animal{
    String color;
    public void bark() {
        System.out.println("Woo! Woo!");
    }
}


class Puppy extends Dog{
    String size;
    public void sleep(){
        System.out.println("Sleeping!");
    }
}


class Cat extends Animal{
    String pattern;
    public void meow(){
        System.out.println("Meow! Meow!");
    }
}