package Module_8;

public class Main {
    public static void main(String[] args){


    }
}


interface Remote{
    abstract public void volumeUp();
    abstract public void volumeDown();
    abstract public void powerOff();
    abstract public void PowerOn();
}

class Television implements Remote{

    @Override
    public void volumeUp() {
        System.out.println("Volume 🔊");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume 🔈");
    }

    @Override
    public void powerOff() {
        System.out.println("Power 🔛");
    }

    @Override
    public void PowerOn() {
        System.out.println("Power 📴");
    }
}