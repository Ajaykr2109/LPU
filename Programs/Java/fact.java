package Java;

import java.util.Scanner;


public class fact {
    public static void main(String[] args)
    {
        int n,check,fact=1,i;
        Scanner sc=new Scanner(System.in);
       
        System.out.println("By which method you want to calculate.");
        System.out.println("Enter 1 for FOR LOOP | 2 for WHILE Loop | 3 for DO-While Loop");
        check=sc.nextInt();
        System.out.println("Enter the Number");
        n=sc.nextInt();
        sc.close();
        i=n;
        if(check==1)
        { 
            for(;i>=1;i--)
            {
                fact=fact*i;
            }
            System.out.println(" Factorial of number " + n + " is "+fact);
        }
        else if(check==2)
        {
            while(i>=1)
            {
                fact=fact*i;
                i--;
            }
            System.out.println(" Factorial of number " + n + " is "+fact);
        }
        else if(check==3)
        {
            do
            {
                fact=fact*i;
                i--;
            }while(i>=1);
            System.out.println(" Factorial of number " + n + " is "+fact);
        }
        else{
            System.out.println("Enter a valid Number.");
        }
       
    }
}
