package tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(5689);
        Socket s = ss.accept();
        System.out.println("Client Connected");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        System.out.println("client"+str);
        //Scanner sc = new Scanner(System.in);
        String word = calc(str);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(word);
        pr.flush();
    }
    public static String calc(String str){
        int p=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
                p=i;
                break;
            }
        }
        double a = Double.parseDouble(str.substring(0,p));
        double b = Double.parseDouble(str.substring(p+1));
        int choice;
        if(str.charAt(p)=='+'){
            choice = 1;
        } else if (str.charAt(p)=='-') {
            choice = 2;
        }else if(str.charAt(p)=='*') {
            choice= 3;
        }
        else {
            choice =4;
        }

        double result =0;
        switch (choice){
            case 1:
                result = a+b;
                break;
            case 2:
                result = a-b;
                break;
            case 3:
                result = a*b;
                break;
            case 4:
                result = a/b;
                break;
        }
        String s=String.valueOf(result);
        return s;
    }
}
