package Java;

import java.util.Scanner;

 class temperature {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Temp=0;
        double f;
        System.out.println("Enter the Temperature in Celcius");
        Temp=sc.nextInt();

        f=Temp*1.8+32;
        System.out.println("Temperature in Fahrenheit "+f);
        sc.close();
    }
}
