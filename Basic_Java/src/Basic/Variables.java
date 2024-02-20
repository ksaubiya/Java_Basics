package Basic;

//Variable code

//there are 3 different variables are avilable
        /*
        1.static :- declare as static
        2.Instance:- declare in main class
        3.local:- used in only function.
         */

//variable declare as int a=10; here a is variable having value 10.

public class Variables {

    static int a=10;    //this is static variable

    void Func(){
        int b=20;   //this is local variable
        System.out.println("this is local variable value as: "+b);
    }
    public static void main(String[] args){

        int c=30;//this is instance variable

        System.out.println("this is static variable value as: "+a);
        Variables v=new Variables();
        v.Func();

        System.out.println("this is instance variable value as:"+ c);

    }
}
