

import java.util.Scanner;

public class lastoccurance {
    public static void main(String[] args) {
		String lastCharStr;
		int i = 0, lIndex = -1;
		
	 Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter String to find Last Occurrence =  ");
		lastCharStr = sc.nextLine();
		
		System.out.print("\nEnter the Last Character to Find =  ");
		int lsch = sc.next().charAt(0);
		
		while(i < lastCharStr.length())
		{
			if(lastCharStr.charAt(i) ==  lsch) {
				lIndex = i;
			}
			i++;
		}
		if(lIndex == -1) {
			System.out.println("\nSorry! We haven't found the Character ");
		}
		else {
			System.out.format("\nThe Last Character Occurrence of %c at %d position", lsch, lIndex);
		}
        sc.close();
}
}
