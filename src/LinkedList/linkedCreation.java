package LinkedList;
import java.util.Scanner;

public class linkedCreation {

    public static Node<Integer> createLinked() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node<Integer> head = null;
        while (n!=-1){
            Node<Integer> temp = new Node<>(n);
            if(head==null){
                head = temp;
            }else {
                Node<Integer> tail = head;
                while (tail.next != null){
                    tail = tail.next;
                }
                tail.next= temp;
            }
            n= sc.nextInt();
        }
        return head;

    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        //Your code goes here
       Node<Integer> temp = head;


    }
    public static void main(String[] args) {
        Node<Integer> head = createLinked();
        listUse.print(head);
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        appendLastNToFirst(head,n);
        listUse.print(head);
    }
}
