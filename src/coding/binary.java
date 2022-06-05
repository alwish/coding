package coding;


public class binary {
    public static int binarySearch(int[] a, int si, int en, int x){
        if(si>en){
            return -1;
        }
        int midIndex = (si+en)/2;
        if(a[midIndex]==x){
            return midIndex;
        }
        else if(a[midIndex]<x){
            return binarySearch(a,midIndex, en, x);
        }
        else {
            return binarySearch(a, si,midIndex, x);
        }
    }
    public static void main(String [] args) {
        int[] a = {1, 2, 5, 6, 8, 10, 15, 20};
        int x = 15;

        System.out.print(binarySearch(a,0, a.length-1,x));

    }
}
