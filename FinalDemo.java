final class FinalDemo {   // final class cannot be inherited

    final int MAX_VALUE = 100;   // final variable (constant)

    final void display() {       // final method cannot be overridden
        System.out.println("Final variable value: " + MAX_VALUE);
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}
