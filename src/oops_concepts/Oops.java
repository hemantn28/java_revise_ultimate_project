package oops_concepts;

class Pen{

    String color;
    String type;
    int price;

    public void write(){
        System.out.println("writing something");
    }

    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.type);

    }

}

class Student{

    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}
public class Oops {
    public static void main(String[] args) {

       /* Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="Gel";
        pen1.price=10;
        pen1.write();
        pen1.printInfo();

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ball point";
        pen2.printInfo();*/

        Student s1=new Student();
        s1.name="Krishna";
        s1.age=24;

        Student s2=new Student(s1);

        s2.printInfo();

    }


}
