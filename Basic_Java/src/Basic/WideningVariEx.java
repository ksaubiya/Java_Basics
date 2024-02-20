package Basic;//Variable Example- Widening

public class WideningVariEx {

    public static void main(String[] args)
    {
        int a=10;
        float f=a;
        System.out.println("Before Widening= "+a);
        System.out.println("After Widening= "+f);
    }
}


/*
Output

Before Widening= 10
After Widening= 10.0

 */