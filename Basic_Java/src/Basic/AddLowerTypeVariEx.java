package Basic;

public class AddLowerTypeVariEx {
    public static void main(String[] args)
    {
        byte a=10;
        byte b=10;
        //byte c=a+b;
        //Compile Time Error
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}


/*
Output

20
 */