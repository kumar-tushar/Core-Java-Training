package Module_2;

public class MethodOverloading {

    public static void main(String[] args){

        add();
        add(10, 45);
        add(10.4f, 7.8f);

    }

    public static void add(){
        int sum=5+7;
        System.out.println(sum);
    }

    public static void add(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }

    public static void add(float a, float b){
        float sum=a+b;
        System.out.println(sum);
    }


}
