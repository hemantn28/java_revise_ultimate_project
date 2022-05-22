import java.util.Scanner;

public class Scanner_Class {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        /*System.out.println("enter number 1");
        int a=sc.nextInt();
        System.out.println("enter number 2");
        int b= sc.nextInt();
        int sum= a+b;
        System.out.println("sum of these numbers is = "+sum);*/

       /* System.out.println("enter num 1");
        float a=sc.nextFloat();
        System.out.println("enter num 2");
        float b=sc.nextFloat();
        float sum=a+b;
        System.out.println("sun of these numbers is = "+sum);*/

       // System.out.println("taking input from user");
       // System.out.println(sc.hasNextInt());

        /*boolean str=sc.hasNextLine();
        System.out.println(str);*/


        //Q.1. Write a program to take two integer inputs from user and print sum and product of them.

        /* System.out.println("Enter the first number");
         int a=sc.nextInt();

        System.out.println("Enter the second number");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("sum = "+sum);

        int multiplication=a*b;
        System.out.println("multiplication ="+multiplication);*/

        //Q.2. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.

        /*System.out.println("enter length of rectangle");
        double length=sc.nextDouble();

        System.out.println("enter breadth of rectangle");
        double breadth=sc.nextDouble();

        double area=length*breadth;
        System.out.println("Area in int =" +(int) area);

        System.out.println("Area in double ="+ area);*/

        //Q.3 Take name, roll number and field of interest from user and print in the format below :
        //Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.

        System.out.print("Enter the name= ");
        String name= sc.next();

        System.out.println("Enter roll no. = ");
        int rollNo=sc.nextInt();

        System.out.println("Enter field of interest = ");
       String field=sc.nextLine();

        System.out.println("Hey my name is "+name+" and my roll no. is "+rollNo+". My field of interest is "+field);




    }
}
