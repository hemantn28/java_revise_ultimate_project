package oops_concepts;

abstract class Animals{
    public Animals() {
    }

    abstract void walk();

    public void eat(){
        System.out.println("animal eats");
    }
}

class Horse extends Animals{
    public void walk(){

        System.out.println("walks on 4 legs");
    }
}

class Hen extends Animals{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Abstraction {

    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        horse.eat();

        Hen hen=new Hen();
        hen.walk();

    }
}
