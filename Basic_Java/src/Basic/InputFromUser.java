package Basic;

import java.util.Scanner;

//write a code to read no from standard user.
public class InputFromUser {

    public static void main(String[] args){

        System.out.print("enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("the give value is: "+a);
    }
}
