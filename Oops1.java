//oops basic
import java.util.*;
public class Oops1{
    public static void main(String args[]){
       Pen p1 = new Pen();//created obj called p1
       p1.setcolor("blue");
       // or p1.color = "yellow";
       System.out.println(p1.color);
       p1.settip(5);
       System.out.println(p1.tip);

    }
}
class Pen{
    //prop
    String color;
    int tip;
    //functions
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}