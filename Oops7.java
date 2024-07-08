//abstraction
import java.util.*;
public class Oops7{
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eats();
        d.walk();//deer wala statememnt print hoga
        Chicken c = new Chicken();
        c.eats();
        c.walk();// chicken wala statememnt print hoga
        //matlb independence diya hai walk function ko for each child class by using abstract
       
       //System.out.println(d.color); //obj deer ka hai but print animal ka brown hoga due to animal is superior
       
       //mustang ka obj create karnege
       Mustang mydeer = new Mustang();
       //order hoga 
       // animal - deer - mustang
    }
    
}
//abstract class - no object
abstract class Animal{
    void eats(){
        System.out.println("animals eats");
    }
    //abstract method - no implementation needed
    abstract void walk();

    //constructor
    // String color;
    // Animal(){
    //     color = "brown"; // ye parent class hai isliye ye brown by default sab child par 1st print hoga
    // }
    
    //constructor
    Animal(){
        System.out.println("animal constructor called");
        
    }
}
class Deer extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
    // void changecolor(){
    //     color = "dark brown";
    // }
    //constructor
    Deer(){
        System.out.println("deer constructor called");
        
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    // void changecolor(){
    //     color = "yellow";
    // }
}
class Mustang extends Deer{
    Mustang(){
        System.out.println("mustang constructor called");
        
    }
}