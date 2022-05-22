package conditionals;

public class NestedConditionals {

    public static void main(String[] args) {

        //AND OPERATOR

        int age=19;
        String colony="Ram Nagar";
        if (age>18 && colony=="Ram Nagar"){
            System.out.println("u r eligible for voting ");
        }
        else {
            System.out.println("u r not eligible for voting");
        }

        //NOT OPERATOR
        if (age>18 && !(colony=="Ram Nagar")){
            System.out.println("u r eligible for voting ");
        }
        else {
            System.out.println("u r not eligible for voting");
        }

        //OR OPERATOR
        int marks=50;
        String subject="Hindi";
        if (marks>75 || subject=="Maths"){
            System.out.println("u got distinction in maths");
        }
        else {
            System.out.println("u did not get distinction in maths");
        }

        //NOT OPERATOR
        if (marks>75 || !(subject=="Maths")){
            System.out.println("u got distinction in maths");
        }
        else {
            System.out.println("u did not get distinction in maths");
        }
    }
}
