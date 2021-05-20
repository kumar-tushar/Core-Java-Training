package Module_2;

public class WhileLoop {

    public static void main(String[] args) {

        int count=0;
        while(count<=10){
            System.out.println(count);
            count++;
        }

        System.out.println();

        int num=5;
        long factorial=1;
        while(num>0){
            factorial*=num;
            num--;
        }
        System.out.println(factorial);
    }
}
