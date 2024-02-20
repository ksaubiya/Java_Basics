package Basic;

import java.util.Scanner;

// write a code to get input from user.
public class GetInputFromUser {

    public static void main(String[] args) {

        System.out.println("enter the given input 1. int, 2. float,3.string");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("the value of integer is : "+a);

        float b=sc.nextFloat();
        System.out.println("the value of float is : "+b);

        String c=sc.next();
        System.out.println("the value of string is :"+c);
    }
}
