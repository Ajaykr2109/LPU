package Java;

import java.util.Scanner;

public class checkupperstring {

    public static void main(String args[]) {
        String st1, st2;
        boolean res;
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the string : ");
        st1 = inpt.nextLine();
        System.out.println("Enter the string to be Searched: ");
        st2 = inpt.nextLine();
        res = st1.contains(st2);
        if (res == true) {
            System.out.println(st2 + ": Found in: " + st1);
        } else {
            System.out.println(st2 + ": Not found in: " + st1);
        }

        inpt.close();

    }
}
