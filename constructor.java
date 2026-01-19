class Student{
    String name;
    int age;    

    // //default constructor
    // Student(){
    //     name="Default name";
    //     age=18;
    // }

    //parameterized constructor
    Student(String n, int a){
        name= n;
        age=a;
    }

    void display(){
        System.out.println("name: "+name+",age: "+age);
    }
}
public class constructor {
    public static void main(String[] args){
        // Student s= new Student();//default constructor called
        // s.display();
         Student s2= new Student("Prisha", 19);//parameterized constructor called
        s2.display();
    }
}
