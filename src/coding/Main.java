package coding;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     // First polynomial
        int n = s.nextInt();
        int degree1[] = new int[n];
        for(int i=0;i<n;i++){
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for(int i=0;i<n;i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i=0;i<n;i++){
            first.setCoefficient(degree1[i], coeff1[i]);
        }
      System.out.print("Polynomial1 is :- ");
        first.printPoly();
    //Second polynomial
      n = s.nextInt();
    int degree2[] = new int[n];
        for(int i=0;i<n;i++){
        degree2[i] = s.nextInt();
    }
    int coeff2[] = new int[n];
        for(int i=0;i<n;i++){
        coeff2[i] = s.nextInt();
    }
    Polynomial second = new Polynomial();
        for(int i=0;i<n;i++){
        second.setCoefficient(degree2[i], coeff2[i]);
    }
        System.out.print("Polynomial2 :- ");
        second.printPoly();

        // polynomial calculator
        int choice = s.nextInt();
        Polynomial result;
        switch (choice){
            case 1:
                result = first.add(second);
                System.out.println("Added Polynomial is:");
                result.printPoly();
                break;
            case 2:
                result = first.sub(second);
                System.out.println("Subtracted Polynomial is:");
                result.printPoly();
                break;
            case 3:
                result = first.mul(second);
                System.out.println("Multiplied Polynomial is:");
                result.printPoly();
                break;
        }

}
}
