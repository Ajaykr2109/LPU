package Java;

import java.util.Scanner;

class rev {
    public static void main(String args[]) {
        String st, rev;
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter the string to be checked: ");
        st = inpt.nextLine();
        StringBuffer sb = new StringBuffer(st);
        sb.reverse();
        rev = sb.toString();
        System.out.println(rev);
        if (st.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        inpt.close();
    }
}
