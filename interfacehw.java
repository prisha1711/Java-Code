interface A {
    default void show() {
        System.out.println("Show from interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Show from interface B");
    }
}

class DiamondProblem implements A, B {

    public void show() {
        A.super.show();   // resolving ambiguity
        B.super.show();
    }

    public static void main(String[] args) {
        DiamondProblem obj = new DiamondProblem();
        obj.show();
    }
}
