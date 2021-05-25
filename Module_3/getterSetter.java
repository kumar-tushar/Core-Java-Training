package Module_3;

public class getterSetter {
    private float length;
    private float breadth;

    //

    public float getArea(){
        return length*breadth;
    }

    public float getPerimeter(){
        return 2*(length+breadth);
    }

    //

    public float getLength(){
        return length;
    }

    public float getBreadth(){
        return breadth;
    }

    public void setLength(float length){
        this.length=length;
    }

    public void setBreadth(float breadth){
        this.breadth=breadth;
    }

    //

    public static void main(String[] args){

        getterSetter r1=new getterSetter();
        r1.setLength(12.9f);
        r1.setBreadth(8.7f);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

    }
}
