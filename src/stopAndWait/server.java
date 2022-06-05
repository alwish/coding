package stopAndWait;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws Exception{
        String ext = "exit";
        ServerSocket ss = new ServerSocket(4999);
        Socket socket = ss.accept();
        String str = "K1";
        while (str.compareTo(ext)!=0){
            Thread.sleep(400);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            str = br.readLine();
            if(str.compareTo(ext)==0){
                break;
            }
            System.out.println("Frame"+str+"received");
            PrintWriter pr = new PrintWriter(socket.getOutputStream());
            pr.println("Received");
            pr.flush();
        }
        System.out.println("All frames received");

    }
}
