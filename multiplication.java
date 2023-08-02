import java.util.Scanner;

public class multiplication {
    public static void main(String args[])
    {
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a  :  ");
        a=sc.nextInt();
        System.out.println("Enter value of b  :  ");
        b=sc.nextInt();
          
        //to manage nigative values
        if(b<0)
        {
            b=-b;
            a=-a;
        }

        int mul=0;
        for(i=1;i<=b;i++)
        {
            mul=mul+a;
        }
      System.out.println("Multiplication : "+mul);
    }
}
