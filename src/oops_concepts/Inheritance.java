package oops_concepts;

class Shape{
    String color;

    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area is " +(l*h)/2);
    }

}

class EquilateralTriangle extends Triangle{

    public void area(int l, int h){
        System.out.println("Area is " +(l*h)/2);
    }
}
public class Inheritance {
    public static void main(String[] args) {

        Triangle t1=new Triangle();
        t1.color="red";
        t1.area(2,6);

    }

}
