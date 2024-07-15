//print the sum, diff and product of two complex no. by creating a class named 'complex' with 
//separate method for each operation whose real and imaginary parts are entered by the user
import java.util.*;
public class Oops11{
    public static void main(String args[]){
       Complex c1 = new Complex(4,5);
       Complex c2 = new Complex(4,4);

       Complex e = Complex.sum(c1,c2);
       Complex f = Complex.diff(c1,c2);
       Complex g = Complex.prod(c1,c2);
       e.printComplex();
       f.printComplex();
       g.printComplex();
    }
} 
class Complex{
    int real;
    int img;
    //constructor to assign value
    public Complex(int r, int i){
        real = r;
        img = i;
    }
    public static Complex sum(Complex a, Complex b){
       return new Complex((a.real+b.real),(a.img+b.img));
     }
    public static Complex diff(Complex a, Complex b){
       return new Complex((a.real-b.real),(a.img-b.img));
     }
    public static Complex prod(Complex a, Complex b){
       return new Complex(((a.real*b.real)+(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
     }
    public void printComplex(){
        if(real == 0 && img != 0){
            System.out.println(img+"i");
        }
        else if(img == 0 && real != 0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+img+"i");
        }
    }
}