package Module_3;

public class Dog {

    public String breed;
    public int size;
    public String color;

    public void bark(){
        System.out.println("Woo! Woo!");
    }

    public void run(){
        System.out.println(breed+" is running");
    }

    public static void main(String[] args){

        Dog dog1=new Dog();
        dog1.breed="German Shepherd";
        dog1.size=50;
        dog1.color="Black";

        dog1.bark();
        dog1.run();
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);

        Dog dog2=new Dog();
        dog2.breed="Labrador";
        dog2.size=35;
        dog2.color="Brown";

        dog2.bark();
        dog2.run();
        System.out.println(dog2.breed);
        System.out.println(dog2.size);
        System.out.println(dog2.color);
    }
}
