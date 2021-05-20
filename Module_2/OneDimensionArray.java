package Module_2;

public class OneDimensionArray {

    public static void main(String[] args) {

        int[] myFirstArray={20,19,48,7};

        myFirstArray[2]=37;
        System.out.println(myFirstArray[2]);

        System.out.println();

        System.out.println(myFirstArray.length);

        System.out.println();

        for(int i:myFirstArray){
            System.out.println(i);
        }


    }
}
