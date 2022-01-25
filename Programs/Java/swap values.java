package Java;

import java.util.Scanner;

//two variable; with input
class test
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in); //taking inputs
// initializing variables
System.out.println("Enter the values of Num 1 & Num 2");
int n1=sc.nextInt(),n2=sc.nextInt();

// Displaying Numbers
System.out.println("Num 1 = " + n1);
System.out.println("Num 2 = " + n2);
n1=n1+n2;
n2=n1-n2;
n1=n1-n2;
System.out.println("Num 1 = " + n1);
System.out.println("Num 2 = " + n2);
sc.close();
}
}


//Single line

/*import java.util.*;
class test
{
public static void main(String args[])
{
int n1,n2;
n1=10;
n2=20;
System.out.println("n1 is: "+n1);
System.out.println("n2 is: "+n2);

n2=(n1+n2)-(n1=n2);

System.out.println("After swapping");
System.out.println("n1 is: "+n1);
System.out.println("n2 is: "+n2);
}
}*/


//another version

/*import java.util.*;
class test
{
public static void main(String args[])
{
int n1,n2;
n1=10;
n2=20;
System.out.println("n1 is: "+n1);
System.out.println("n2 is: "+n2);

n2=(n1*n2)/(n1=n2);

System.out.println("After swapping");
System.out.println("n1 is: "+n1);
System.out.println("n2 is: "+n2);
}
}*/