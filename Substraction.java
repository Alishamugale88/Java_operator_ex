import java.util.Scanner;
    public class Substraction
{
    public static void main(String args[])
    {
        int a,b,sub;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a : ");
        a=sc.nextInt();
        System.out.println("Enter value of b : ");
        b=sc.nextInt();

        sub=a+(~b+1);

        System.out.println("Substraction : "+sub);
    }
}

