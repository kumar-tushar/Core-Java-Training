package Module_7;

public class Main {

    public static void main(String[] args){

    }
}


interface Animal{
    abstract void run();
    abstract void eat();
}



class Dog implements Animal {

    @Override
    public void run() {
        System.out.println("Dog Running");
    }

    @Override
    public void eat(){
        System.out.println("Dog Eating");
    }

}