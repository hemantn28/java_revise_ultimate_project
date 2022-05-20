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
            System.out.printf("u r tall");
        }
        else {
            System.out.printf("u r short");
        }

        int price=987;
        if (price>999){
            System.out.printf("product is costly");
        }
        else {
            System.out.printf("product is cheap");
        }
    }

}
