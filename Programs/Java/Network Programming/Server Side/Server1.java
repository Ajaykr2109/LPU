import java.io.*;
import java.net.*;

public class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss;
            Socket s;
            DataInputStream dis;

            String str;
            
            while (true) {
                ss = new ServerSocket(6666);
                s = ss.accept();// establishes connection
                dis = new DataInputStream(s.getInputStream());

                str = (String) dis.readUTF();
                System.out.println("message= " + str);
                ss.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}