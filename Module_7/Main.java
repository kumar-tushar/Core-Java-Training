package Module_7;

public class Main {

    public static void main(String[] args){

    }
}

interface Animal{
    public void run(){
        System.out.println("Animal Running");
    }
    abstract void eat();
}

class Dog implements Animal {
    @Override
    public void eat(){
        System.out.println("Dog Eating");
    }

}