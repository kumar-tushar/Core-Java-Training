package Module_3;

public class Rectangle{

    float length;
    float breadth;

    public float getArea(){
        return length*breadth;
    }

    public float getPerimeter(){
        return 2*(length+breadth);
    }


    public static void main(String[] args){

        Rectangle r1=new Rectangle();
        r1.length=12.9f;
        r1.breadth=8.7f;

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
