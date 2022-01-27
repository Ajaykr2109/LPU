package Java;

import java.util.Scanner;

public class electricitybill {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        int units,bill;
        System.out.println("Enter the Units Consumed");
        units=sc.nextInt();

        if(units<=100){
            bill=units*5;
            System.out.println("Total billed amount is "+ bill);
        }
        else if((units>100)&&(units<=200)){
            bill=(100*5)+(units-100)*7;
            System.out.println("Total billed amount is "+ bill);
        }
        else if((units>200)&&(units<=300)){
            bill=(100*5)+(100*7)+(units-200)*10;
            System.out.println("Total billed amount is "+ bill);
        }
        else if(units>300){
            bill=(100*5)+(100*7)+(100*10)+(units-300)*15;
            System.out.println("Total billed amount is "+ bill);
        }
        else{
            System.out.println("Error!!");
        }
        
        
        
        sc.close();
    }
}
