package pl.pjatk.tdd.strings;

public class StringUtils {

    public static int sumDigits(String str){
        char[] c = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                System.out.print("Digits in the String : " + c[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum;
    }

    public static boolean checkPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            char front = Character.toLowerCase(str.charAt(i));
            char back = Character.toLowerCase(str.charAt(str.length()-1-i));
            if(front != back){
                return false;
            }
        }
        return true;
    }
}
