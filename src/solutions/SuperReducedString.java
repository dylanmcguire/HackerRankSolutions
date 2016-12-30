package solutions;

import java.util.Scanner;

/**
 * @author Dylan McGuire
 */
public class SuperReducedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(reduceString(in.next()));
    }


    public static String reduceString(String string) {
        for (int i = 0; i < string.length(); i++) {
            char last = i > 0 ? string.charAt(i - 1) : '!';
            char cur = string.charAt(i);
            if (cur == last){
                String start = string.substring(0, i - 1);
                String end = i < string.length() ? string.substring(i + 1, string.length()) : "";
                return reduceString(start + end);
            }
        }

        return string.isEmpty() ? "Empty String" : string;
    }

}
