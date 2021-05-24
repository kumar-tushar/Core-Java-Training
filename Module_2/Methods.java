package Module_2;

public class Methods {

    public static void calculateSimpleInterest(int principal, float rateOfInterest, int timePeriod) {
        double si=principal*rateOfInterest*timePeriod/100;
        System.out.println(si);
    }

    public static void main(String[] args){

        calculateSimpleInterest(10000, 8.7f, 2);

    }
}
