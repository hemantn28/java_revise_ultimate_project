package oops_concepts;


class Animal{
    String name;
    int age;

    public void eat(){
        System.out.println("Animal eats");
    }
}
public class FunctionOverriding {

    public static void main(String[] args) {

        Forest_Animal a1=new Forest_Animal();
        a1.eat();

        Dog d1=new Dog();
        d1.eat();

        Cat c1=new Cat();
        c1.eat();
    }
}
