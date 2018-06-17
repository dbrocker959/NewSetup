/**
 * Created by Deep's Laptop on 2/25/2017.
 */
public class HelloWorld {

    public static void main(String [] args) {
        System.out.println("Hello World!");
        //sameEnds("abXYab");
        /*System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(25));
        System.out.println(diff21(35));
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));*/
        HelloWorld helloWorld= new HelloWorld();
        boolean test = helloWorld.makes10(9, 10);
        System.out.println(test);
        test = makes10(9, 9); 
        System.out.println(test);
        test = makes10(1, 9);
        System.out.println(test);
    }


    public static String sameEnds(String string) {
        String longestSubstr = null;

        for (int i=0; i < string.length(); i++){
            int j = string.length()-1-i;
            String firstSubStr = string.substring(0,i+1);
            if (string.charAt(i) != string.charAt(j)){
                return longestSubstr;
            } else longestSubstr = firstSubStr;
        }
        return longestSubstr;
    }

    public static int diff21(int n) {
        return (n <= 21)? Math.abs(21-n): 2* Math.abs(21-n);
    }

    public  boolean parrotTrouble(boolean talking, int hour) {
            if (talking && (hour > 7 || hour < 20)) return true;
            else return false;
    }
    public boolean makes10(int a, int b) {
           if ((a == 10 || b ==10 )||(a+b == 10))return true;
           else return false;
    }


}
