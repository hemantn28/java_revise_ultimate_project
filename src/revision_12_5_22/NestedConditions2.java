package revision_12_5_22;

public class NestedConditions2 {

    public static void main(String[] args) {

        int price=49;
        String market="Railway Road";

        /*if (price>60 && market=="Railway Road"){
            System.out.println("product is costly at Railway Road Market");
        }
        else {
            System.out.println("product is not costly");
        }*/
        //NOT OPERATOR

       /* if (!(price>60) && market=="Railway Road"){
            System.out.println("product is costly at Railway Road Market");
        }
        else {
            System.out.println("product is not costly");
        }*/

        //OR OPERATOR

        double salary=50000.500;
        String city="Chennai";

        if (salary>100000 || city== "Bangalore"){
            System.out.println("your salary is high & u r living in bangalore");
        }
        else {
            System.out.println("your salary is neither high & u r not living in Bangalore");
        }

    }
}
