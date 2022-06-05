package coding;

public class Polynomial {
    int[] coefficient = new int[100];

    public void setCoefficient(int degree, int coeff){
        // set here coefficient
        if(degree>=this.coefficient.length){
            doubleCapacity();
        }
        this.coefficient[degree]= coeff;
    }

    public void doubleCapacity() {
        int[] temp = this.coefficient;
        coefficient = new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            coefficient[i]= temp[i];
        }
    }

    public void printPoly() {
        // print here
        for (int i = 0; i < this.coefficient.length; i++) {
            if (this.coefficient[i] != 0) {
                System.out.print(coefficient[i] + "x" + i + " ");
            }
        }
        System.out.println();
    }



        public Polynomial add (Polynomial p){
        for(int i=0;i<this.coefficient.length;i++){
            for(int j=0;j<p.coefficient.length;j++){
                if(i==j&&(this.coefficient[i]!=0||p.coefficient[j]!=0)){
                    this.coefficient[i]=this.coefficient[i]+p.coefficient[j];
                }
            }
        }
            return this;
        }

        public Polynomial sub (Polynomial p){
            for(int i=0;i<this.coefficient.length;i++){
                for(int j=0;j<p.coefficient.length;j++){
                    if(i==j&&(this.coefficient[i]!=0||p.coefficient[j]!=0)){
                        this.coefficient[i]=this.coefficient[i]-p.coefficient[j];
                    }
                }
            }
            return this;
        }


        public Polynomial mul (Polynomial p){
            Polynomial a = new Polynomial();
            for(int i=0;i<this.coefficient.length/2;i++){
                for (int j=0;j<p.coefficient.length/2;j++){
                    a.coefficient[i+j] = a.coefficient[i+j]+(this.coefficient[i]*p.coefficient[j]);
                }
            }
            return a;
        }

    }



