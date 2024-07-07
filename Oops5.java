//constuctors deep and shallow copy
public class Oops5{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "jc";
        s1.roll = 24;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        System.out.println(s1.name+s1.roll);

        Student s2 = new Student(s1);//copied
        s2.password = "xyz";

        s1.marks[2] =100; // this will not refect as we deep copied it 
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //constructor for s1 object
    Student(){
        marks = new int[3];
        System.out.println("hi");
    }
    
    //shallow copy constructor - marks changed in s1 is reflect in s2
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i]; //completely copied s1  ... so no change reflectd 
        }
    }
    
}