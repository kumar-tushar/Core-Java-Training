package Module_3;

public class Rectangle{

    float length;
    float breadth;

    public Rectangle(){
        this(20.4f, 10.2f);
    }

    public Rectangle(float l){
        length=l;
    }

    public Rectangle(float length, float breadth){
        this.length=length;
        this.breadth=breadth;
    }

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

        Rectangle r2=new Rectangle(20.4f, 18.2f);
        System.out.println(r2.length);
        System.out.println(r2.breadth);
    }
}
