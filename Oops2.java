//oops basic
import java.util.*;
public class Oops2{
    public static void main(String args[]){
       Pen p1 = new Pen();//created obj called p1
       p1.setcolor("blue");
       // or p1.color = "yellow";
       System.out.println(p1.getcolor());
       p1.settip(5);
       System.out.println(p1.gettip());

    }
}
class Pen{
    //prop
    private String color;
    private int tip;
    //functions
    void setcolor(String color){
        this.color = color;
    }
    void settip(int tip){
       // tip = newtip;
       this.tip = tip;
    }
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
}