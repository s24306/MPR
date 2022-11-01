package mpr2;

public class StringUtils {

    public static String toUpperCase(String string) {
        String stringUpper = "";
        for (int i = 0; i < string.length(); i++) {
            stringUpper += Integer.valueOf((char) (((int) string.charAt(i)))) == Integer.valueOf((char) 32) ? String.valueOf((char) (32)) : String.valueOf((char) (((int) string.charAt(i) - 32)));
        }
        return stringUpper;
    }

    public static String reverseString(String string) {
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        return reversed;
    }

    public static String multiplyString(String string, int a) {
        String multiplied = "";
        for (int i = 0; i < a; i++) {
            multiplied += string;
        }
        return multiplied;
    }

    public static String removeSmallChars(String string) {
        String smallRemoved = "";
        for (int i = 0; i < string.length(); i++) {
            smallRemoved += (122 >= (int)string.charAt(i) && (int)string.charAt(i) >= 97) ? "" : string.charAt(i);
        }
        return smallRemoved;
    }

    public static String removeBigChars(String string) {
        String bigRemoved = "";
        for (int i = 0; i < string.length(); i++) {
            bigRemoved += (90 >= (int)string.charAt(i) && (int)string.charAt(i) >= 65) ? "" : string.charAt(i);
        }
        return bigRemoved;
    }

    public static String removeAllButLetters(String string) {
        return string.replaceAll("[^a-zA-Z0-9]", "");
    }
}
