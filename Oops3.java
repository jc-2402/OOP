//constuctors
public class Oops3{
    public static void main(String[] args) {
        Student s1 = new Student("jc",5);
        System.out.print(s1.name+s1.roll);
    }
}
class Student{
    String name;
    int roll;
    //constructor
    Student(){
        System.out.println("hi");
    }
    //const passing argument
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    
}