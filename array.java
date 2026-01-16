//ARRAY
// public class array {
//     public static void main(String[] args){
//        char[] name = {'P', 'r', 'i', 's', 'h', 'a'};
        
//         for(char c : name) {
//             System.out.print(c);
//         }

//         System.out.println(" ");
        
//         for (int i = 0, j = name.length - 1; i < j; i++, j--) {
//             char temp = name[i];
//             name[i] = name[j];
//             name[j] = temp;
//         }
        
//         for(char c : name) {
//             System.out.print(c);
//         }
//     }
// }


//STRING
public class array {
    public static void main(String[] args){
        String name = "Prisha";
        System.out.println(name);
        String reversed = "";
        for(int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println(reversed);
    }
}
