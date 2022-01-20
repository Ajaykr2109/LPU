package Java;

import java.util.Scanner;

 class areaofsquare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side=0,area=0;
        
        System.out.println("Length of square is:-");
        side=sc.nextInt();

        area=side*side;
        System.out.println("Area of Square "+ area);
        
    }
}
