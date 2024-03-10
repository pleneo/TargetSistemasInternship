public class Main {
    //Inverter Strings

    
    public static void main(String[] args) {
        String x = "Hello World!";
        reverseString(x);
    }

    public static void reverseString(String x){
        for(int i=x.length()-1; i>=0; i--){
            System.out.print(x.charAt(i));
        }
    }






}
