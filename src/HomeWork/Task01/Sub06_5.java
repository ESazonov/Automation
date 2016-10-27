package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016.
 */
public class Sub06_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        String box = "";

        for (String a : nums) {
            if (a.length() == 3) {
                if (a.charAt(0) != a.charAt(1) && a.charAt(0) != a.charAt(2) && a.charAt(2) != a.charAt(1)) {
                    box += a + " ";
                }
            }
        }
        System.out.println("Разные: " + box);
    }
}
