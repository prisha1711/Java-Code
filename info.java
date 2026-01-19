public class info {
    //Write a program in java to print your name, roll_no, address in 3 different lines.

    static void printChar(String a) {
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
       String name="Prisha";
       String roll_no="24070122145";
       String address="Ludhiana, Punjab";
       printChar(name);
       printChar(roll_no);
       printChar(address);


    }

}
