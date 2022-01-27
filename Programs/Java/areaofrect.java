package Java;

import java.util.Scanner;

class rect {
    int s1, s2;

    void get(int x, int y) {
        s1 = x;
        s2 = y;
    }

    void disp() {
        System.out.println("Side 1 = " + s1);
        System.out.println("Side 2 = " + s2);
    }

    int area() {
        int r;
        r = s1 * s2;
        return r;
    }
}

class areaofsquare {
    public static void main(String[] args) {
        int a, b;
        int result;
        rect obj = new rect();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Side 1:");
        a = scan.nextInt();
        System.out.println("Enter Side 2:");
        b = scan.nextInt();
        obj.get(a, b);
        result = obj.area();
        obj.disp();
        System.out.println("Area=:" + result);
        scan.close();
    }
}
