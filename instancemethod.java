class Person{
    String name;

void display(){
    System.out.println("name: "+name);
}
}

public class instancemethod {
    public static void main(String[] args){
        Person p= new Person();
        p.name="prisha";
        p.display();
    }
}
