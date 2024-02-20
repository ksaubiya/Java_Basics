package Basic;

//write program to swap two number using 3rd variable.

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {

        System.out.println("enter first value:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("enter second value:");
        int b=sc.nextInt();

        int temp;

        System.out.println("the before swapping values are: "+a+" & "+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("the after swapping values are: "+a+" & "+b);

    }
}

/*
Output:-

enter first value:
10
enter second value:
20
the before swapping values are: 10 & 20
the after swapping values are: 20 & 10

 */
