package coding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;


public class one {
    public static ArrayList<Integer> removeDuplicates(int arr[]){
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arrL.get(arrL.size()-1)){
                arrL.add(arr[i]);
            }
        }
        return arrL;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> result;
        result = removeDuplicates(a);
        for(int i: result){
            System.out.print(i+" ");
        }


    }
}
