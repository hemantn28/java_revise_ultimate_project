package pure_abstraction;

interface Pet{
    int eyes=2;
    public void walk();

}
interface Herbivore{

}
class Cow implements Pet,Herbivore{

    @Override
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}
public class Pure_Abstraction {
    public static void main(String[] args) {
        Cow cow=new Cow();
        cow.walk();
    }
}
