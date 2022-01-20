package Java;

import java.util.Scanner;
//array concept
public class evenodd {

    void meth1()
    {
        int a=9;
        int b;
        b=a/2*2-a;
        if(b==0)
        {
        System.out.println(a+ " is even...");
        }
        else
        {
        System.out.println(a+ " is odd...");
        
        //with / operator
        }
    }
    public static void main(String[] args) {
        
         
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        String[] arr = {"Even", "Odd"};
        System.out.println(arr[no%2]);
        sc.close();
    }
    
}
