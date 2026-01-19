class Student{
    int id;
    String name;
}
public class instancevar {
    public static void main(String[] args){
        Student s1= new Student();
        s1.id=101;
        s1.name="Alice";
        System.out.println(s1.id+" "+s1.name);
        Student s2= new Student();
        s2.id=102;
        s2.name="Prisha";
        System.out.println(s2.id+" "+s2.name);
    }
}
