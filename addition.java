//addition without using + operator 

import java.util.Scanner;

public class addition
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of x : ");
        x=sc.nextInt();
        System.out.println("enter value of y : ");
        y=sc.nextInt();
        
        if(y<0)
        {
            y=-y;
            x=-x;
        }
        //1st method
        /*while(y!=0)
        {
            x++;
            y--;
        }

        System.out.println("Sum : "+x);*/

        //2nd method
        /*  for(int i=1;i<=y;i++)
        {
            x++;
        }
        System.out.println("Sum : "+x);*/
  
         //3rd approach
         System.out.println("Sum : "+(x-(-y)));


    }
}