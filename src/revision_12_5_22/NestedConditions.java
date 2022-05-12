package revision_12_5_22;

public class NestedConditions {
    public static void main(String[] args) {

        int age=14;
        String city="Delhi";
//AND Operator

       if (age>18 && city=="Agra"){
            System.out.println("Eligible for voting in Agra");
        }
        else {
            System.out.println("Not Eligible");
        }

        //Not Operator
        if (!(age>18 && city=="Agra")){
            System.out.println("Eligible for voting in Agra");
        }
        else {
            System.out.println("Not Eligible");
        }

        //OR Operator

        int marks=80;
        String subject="Maths";

        /*if (marks>75 || subject=="Maths"){
            System.out.println("First division in maths");
        }
        else {
            System.out.println("Not first division in maths");
        }*/

        //Not Operator
        if (!(marks>75) || subject=="Maths"){
            System.out.println("First division in maths");
        }
        else {
            System.out.println("Not first division in maths");
        }





    }
}
