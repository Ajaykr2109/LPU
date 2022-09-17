// // import java.util.*; 
// // import java.io.*;
// // // Input: "Hello-LOL"
// // // Output: ELLO-lol

// // public class himanshu {
// //     public static void main(String[] args) throws IOException {
// //         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //         String s = br.readLine();
// //         String s1 = "";
// //         String s2 = "";
// //         for (int i = 0; i < s.length(); i++) {
// //             if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
// //                 s1 += s.charAt(i);
// //             } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
// //                 s2 += s.charAt(i);
// //             }
// //         }
// //         System.out.println(s1.toLowerCase() + "-" + s2.toUpperCase());
// //     }
// // }
// // //remove first element of string
// // // Input: "Hello"
// // // Output: ello

// // public class himanshu {
// //     public static void main(String[] args) throws IOException {
// //         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //         String s = br.readLine();
// //         System.out.println(s.substring(1));
// //     }
// // }

// //input: (())) output:1
// // remove extra brackets to form proper brackets
//  public class himanshu {
//         public static void main(String[] args) throws IOException {
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             String s = br.readLine();
//             int count = 0;
//             int count1 = 0;
//             for (int i = 0; i < s.length(); i++) {
//                 if (s.charAt(i) == '(') {
//                     count++;
//                 } else if (s.charAt(i) == ')') {
//                     count1++;
//                 }
//             }
//             System.out.println(Math.abs(count - count1));
//         }
//     }
//     Scanner s=new Scanner(System.in);
//     s.nextLine();

//     //import scanner
//     import java.util.*;




// Input: "123hg*aaabb"
// Final Output: 1hbgb

public class himanshu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                s1 += s.charAt(i);
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                s2 += s.charAt(i);
            }
        }
        String s3 = s1 + s2;
        String s4 = "";
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i) >= 'A' && s3.charAt(i) <= 'Z') {
                s4 += s3.charAt(i);
            }
        }
        System.out.println(s4);
    }
}
