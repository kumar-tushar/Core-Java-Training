package Module_12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String data="I Love India";

        try {
            FileOutputStream enterData = new FileOutputStream("file.txt");
            byte[] byteData = data.getBytes();
            enterData.write(byteData);
            enterData.close();
        }
        catch(IOException e ){
            System.out.println();
        }



        try {
            FileInputStream readData = new FileInputStream("file.txt");
            int i;
            while((i=readData.read())!=-1){
                System.out.print((char) i);
            }
            readData.close();
        }
        catch(IOException e){
            System.out.println();
        }
    }
}