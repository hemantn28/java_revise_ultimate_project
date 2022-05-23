package oops_concepts;

class Scholar{

    String name;
    int rollNo;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int rollNo){
        System.out.println(rollNo);
    }

    public void printInfo(String name, int rollNo){
        System.out.println(name +" "+ rollNo);
    }
}
public class Polymorphism {

    public static void main(String[] args) {

        Scholar s1=new Scholar();

        s1.name="Vikas";
        s1.rollNo=36;

        s1.printInfo(s1.name, s1.rollNo);


    }

}
