//method overloading
import java.util.*;
public class Oops6{
    public static void main(String[] args) {
       Calculator c = new Calculator();
       System.out.println(c.sum(2,2)); 
       System.out.println(c.sum((float)2,(float)2));
       System.out.println(c.sum(2,2,2));
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum (float a, float b){
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
}