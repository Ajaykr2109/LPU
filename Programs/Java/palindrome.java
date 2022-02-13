package Java;

import java.util.Scanner;

public class palindrome {
    public static boolean printf(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (printf(str))
            System.out.println(true);
        else
            System.out.println(false);

        sc.close();
    }
}