//write one progam in java to implement static variable and method
class Counter {
    static int count = 0;

    static void increment() {
        count++;
        System.out.println("Count is :" + count);
    }
}

public class staticv {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        Counter.increment();
        System.out.println("Final count:" + Counter.count);
    }

}