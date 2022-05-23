package object_class_methods;

public class ObjectClass {

    public static void main(String[] args) {

        ObjectClass obj=new ObjectClass();

        ObjectClass obj1=new ObjectClass();

        System.out.println("to String method of obj: "+obj.toString());

        System.out.println("to String method of obj1: "+obj1.toString());

        System.out.println("to hashcode method of obj: "+obj.hashCode());

        System.out.println("to hashcode method of obj1: "+obj1.hashCode());

        System.out.println("equals method: "+obj.equals(obj1));

        System.out.println("get class method of obj: "+obj.getClass());

        System.out.println("get class method of obj1: "+obj1.getClass());



    }
}
