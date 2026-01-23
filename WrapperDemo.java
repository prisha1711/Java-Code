public class WrapperDemo{
    public static void main(String[] args) {
        int i=3;
        double d=2.4;
        System.out.println("Primitive int: "+i);
        System.out.println("Primitive double: "+d);
        Integer i1=Integer.valueOf(i);
        Double d1=Double.valueOf(d);
        System.out.println("Wrapper Integer: "+i1);
        System.out.println("Wrapper Double: "+d1);  
        String str1="123";
        String str2="123";
        System.out.println("Answer is: "+(str1+str2));
        int num1=Integer.parseInt(str1);    
        int num2=Integer.parseInt(str2);
        System.out.println("Answer is: "+(num1+num2));
    }
}