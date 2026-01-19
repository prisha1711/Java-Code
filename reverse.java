//string reversal using predefined function and without using predefined function
class reverse {
    static void printChar(String a) {
        for (int i = a.length() - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
    }

    public static void main(String[] args) {
        String a = "Prisha";
        printChar(a);
    }
}
