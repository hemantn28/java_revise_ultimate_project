package conditionals;

public class Conditional_Statements {

    public static void main(String[] args) {

        int age=17;
        if(age>18){
            System.out.println("u r eligible for voting");
        }
        else {
            System.out.println("u r nor eligible for voting");
        }
        int marks=80;
        if (marks>75){
            System.out.println("u got distinction");
        }
        else {
            System.out.println("u did not get distinction");
        }

        float height=4.10f;
        if (height>5.0f){
            System.out.println("u r tall");
        }
        else {
            System.out.println("u r short");
        }

        int price=987;
        if (price>999){
            System.out.println("product is costly");
        }
        else {
            System.out.println("product is cheap");
        }

        String city="Ratlam";
        if (city=="Agra"){
            System.out.println("u r in Agra");
        }
        else {
            System.out.println("U r not in Agra");
        }

        String name="Rakesh";
        if (name=="Amit"){
            System.out.println("u r the same person");
        }
        else {
            System.out.println("U r not the same person");
        }
    }



}
