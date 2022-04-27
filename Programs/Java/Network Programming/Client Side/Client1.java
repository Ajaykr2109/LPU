import java.io.*;
import java.net.*;

public class Client1 {
    public static void main(String[] args) {
        try {
            for(int i=0; i<10; i++) {
                Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello MCA");
            dout.flush();
            dout.close();
            s.close();
            }
            /*Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello MCA");
            dout.flush();
            dout.close();
            s.close();*/
        }
         catch (Exception e) {
            System.out.println(e);
        }
    }
}