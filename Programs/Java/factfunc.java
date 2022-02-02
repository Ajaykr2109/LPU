package Java;

import java.util.Scanner;

class test {
    int i, fact;
    int number;

    void set(int a) {
        i = 1;
        number = a;
        fact = 1;
    }

    void display() {
        System.out.println("Factorial = " + fact);
    }

    void cal(int c) {
        if(c==1)
        { 
            for(;i>=1;i--)
            {
                fact=fact*i;
            }
            System.out.println(" Factorial of entered number  is "+fact);
        }
        else if(c==2)
        {
            while(i>=1)
            {
                fact=fact*i;
                i--;
            }
            System.out.println(" Factorial of entered number  is "+fact);
        }
        else if(c==3)
        {
            do
            {
                fact=fact*i;
                i--;
            }while(i>=1);
            System.out.println(" Factorial of entered number  is "+fact);
        }
        else{
            System.out.println("Enter a valid Number.");
        }
    }
}

public class factfunc {
    public static void main(String args[]) {
        int n,check;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = input.nextInt();
        System.out.println("Enter 1 for FOR LOOP | 2 for WHILE Loop | 3 for DO-While Loop");
        check = input.nextInt();
        test ob = new test();
        ob.set(n);
        ob.cal(check);
        ob.display();
        input.close();
    }
}