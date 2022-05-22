package Ch_2_PractiseSet;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {

        //Q.1. write a programme to add three numbers in java.

       /* int a,b,c;
        a=45;
        b=56;
        c=47;
        int result=a+b+c;
        System.out.println("The addition is "+result);*/

        //Q.2. Write a java programme to calculate CGPA using marks of three subjects out of 100.

       /* double hindi=80;
        double physics=75;
        double maths=76;

        double cgpa= (hindi+physics+maths)/30;
        System.out.println("cgpa = "+cgpa);*/

        //Q.3. Write a java programme which asks the user to enter his/her name and greets them with
        // "Hello, <name> , have a good day" text.

       /* System.out.println("What is your name?");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello "+ name +" have a good day");*/


        //Q.4. Write a java programme to convert kms into miles.

       /* double kilometers;

        System.out.println("Plz enter the kilometers");

        Scanner s=new Scanner(System.in);

        kilometers=s.nextDouble();

        double miles=kilometers/1.609;

        System.out.println("miles "+ miles);*/

        //Q.5 Write a java programme to detect whether a number entered by you is integer or not.

       /* System.out.println("Enter ur number");

        Scanner sca=new Scanner(System.in);

        System.out.println(sca.hasNextInt());*/

        //Q.6. Write a  programme to calculate the percentage of a given student in CBSE board exam.
        // His marks from 5 subjects must be taken as input from user.

        System.out.println("Taking input from the user");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter marks in hindi");
        double hindi=sc.nextDouble();

        System.out.println("enter marks in science");
        double science=sc.nextDouble();

        System.out.println("enter marks in sst");
        double sst=sc.nextDouble();

        System.out.println("enter marks in maths");
        double maths=sc.nextDouble();

        System.out.println("enter marks in english");
        double english=sc.nextDouble();



        double obtainedMarks= hindi+english+maths+sst+science;
        System.out.println("obtainedMarks ="+obtainedMarks);

        double percentage= (obtainedMarks)*100/500;
        System.out.println("percentage ="+percentage);














    }
}
