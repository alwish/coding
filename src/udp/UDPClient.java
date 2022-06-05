package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        System.out.print("Which integer will you like to give:");
        int i=sc.nextInt();
        byte b[]=String.valueOf(i).getBytes();
        InetAddress IP=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(b,b.length,IP,1889);
        ds.send(dp);
        byte data[]=new byte[1024];
        DatagramPacket dp1=new DatagramPacket(data,data.length);
        ds.receive(dp1);
        String str=new String(dp1.getData());
        System.out.println("Number: "+str);
    }


}
