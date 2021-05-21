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

        System.out.println();

        float[] mySecondArray=new float[3];
        mySecondArray[0]=34.2f;
        mySecondArray[1]=4.6f;
        mySecondArray[2]=78.11f;

        float sum=0;
        for(float value:mySecondArray){
            sum+=value;
            System.out.println(value);
        }
        System.out.println("sum: "+sum);

    }
}
