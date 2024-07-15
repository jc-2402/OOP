//super keyword
//abstraction
import java.util.*;
public class Oops10{
    public static void main(String[] args) {
        Deer d = new Deer();
        System.out.println(d.color);
    }
    
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
        
    }
}
class Deer extends Animal{
    //constructor
    Deer(){
        //super
        super(); // this will call parenst const 1st then child
        super.color = "red";
        System.out.println("deer constructor called");
        
    }
}