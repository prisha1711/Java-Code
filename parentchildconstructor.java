class Parent{
    Parent(){
        System.out.println("parent class constructor");
    }
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("child class constructor");
    }
}

public class parentchildconstructor {
    public static void main(String[] args){
        new Child();
    }
}
