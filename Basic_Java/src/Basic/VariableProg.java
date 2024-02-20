package Basic;

/*
This is simple varibale program.
--------------------------------
There are diffrent types of variables:-
1.static- can't change
2.local-used only in method only can't access by other
3.instance- just like global used by all.
 */
public class VariableProg {

    static int m=100;   //static variable

    void method()
    {
        int n=90;   //local variable
        System.out.println("local variable= "+n);
    }

    public static void main(String[] args)
    {
        int data=50;    //instance variable

        System.out.println("static variable= "+m);
        System.out.println("local variable= can't access outside method");
        System.out.println("instance variable= "+data);
    }
}

/*
Output


static variable= 100
local variable= can't access outside method
instance variable= 50

 */