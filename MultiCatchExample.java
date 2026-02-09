public class MultiCatchExample {
    public static void main(String[] args){
        try{
            String str= null;
            System.out.println(str.length());
        } catch(NullPointerException e){
            System.out.println("null pointer exception");
        } catch (Exception e){
            System.out.println("some error");
        }
        System.out.println("prog continues after some error handling");
    }
}
