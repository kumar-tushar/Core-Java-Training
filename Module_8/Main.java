package Module_8;

public class Main {
    public static void main(String[] args){

        Remote remote=new Television();

        remote.volumeUp();
        remote.volumeDown();
        remote.PowerOn();
        remote.powerOff();


    }
}


interface Remote{
    void volumeUp();
    void volumeDown();
    void powerOff();
    void PowerOn();
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
    public void PowerOn() {
        System.out.println("Power 🔛");
    }

    @Override
    public void powerOff() {
        System.out.println("Power 📴");
    }
}