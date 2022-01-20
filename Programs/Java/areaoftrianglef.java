package Java;

import java.util.Scanner;

public class areaoftrianglef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1,s2,s3,ip1,resarea,cal;
        
        System.out.println("Side 1 of Triangle is:-");
        s1=sc.nextInt();

        System.out.println("Side 2 of Triangle is:-");
        s2=sc.nextInt();

        System.out.println("Side 3 of Triangle is:-");
        s3=sc.nextInt();

        ip1=(s1+s2+s3)/2.0d;
        cal=ip1*(ip1-s1)*(ip1-s2)*(ip1-s3);

        if(cal<=0)
        {
            System.out.println("Sides are not valid");
        }
        else{
            resarea=Math.sqrt(cal);
            System.out.println("Area of Triangle is:-"+ resarea);
        }
        
        sc.close();
    }
    
}
