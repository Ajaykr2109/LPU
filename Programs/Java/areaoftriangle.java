package Java;

import java.util.Scanner;

 public class areaoftriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width=0,area=0,height=0;
        
        System.out.println("Width of Triangle is:-");
        width=sc.nextInt();

        System.out.println("Height of Triangle is:-");
        height=sc.nextInt();

        area=(width*height)/2;
        System.out.println("Area of Triangle is:-"+ area);
        sc.close();
    }
}
