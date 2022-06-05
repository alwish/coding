package stopAndWait;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class client {
    public static void main(String[] args)throws Exception {
        Socket socket = new Socket("localhost",4999);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of frames sent");
        int n = in.nextInt();
        for(int i=1;i<n+1;){
            PrintWriter pwrt = new PrintWriter(socket.getOutputStream());
            if(i==n+1){
                pwrt.println("exit");
                pwrt.flush();
                break;
            }
            System.out.println("Frame"+i+"sent");
            pwrt.println(i);
            pwrt.flush();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = br.readLine();
            if(str!=null){
                System.out.println("Acknowledgement received");
                i++;
                Thread.sleep(400);
            }else {
                pwrt.println(i);
            }
        }

    }
}
