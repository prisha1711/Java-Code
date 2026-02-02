class ParentF{
    final void display(){
        System.out.println(" Final method in parent clasa");
    }
}

class ChildF extends ParentF{
    //void display() {} //compilation error if attempted
}
public class finalmethod {
    public static void main(String[] args){
        ChildF c= new ChildF();
        c.display();
    }
}
