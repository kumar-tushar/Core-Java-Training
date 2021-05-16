package Module_1;

import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {

        String name;
        int population;
        float populationDensity;
        double GDP;
        char currency;
        boolean isSecular;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter country:");
        name=scanner.nextLine();
        System.out.println("Enter population:");
        population= scanner.nextInt();
        System.out.println("Currency:");
        currency=scanner.next().charAt(0);
        System.out.println("Country: "+name);
        System.out.println("Population: "+population);
        System.out.println("Currency: "+currency);
        scanner.close();


    }
}
