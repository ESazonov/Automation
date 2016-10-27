package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016.
 */
public class Sub06_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        String div = "";

        for (String a : nums) {
            if (Integer.parseInt(a) % 3 == 0 || Integer.parseInt(a) % 9 == 0) {
                div += a + " ";
            }
        }
        System.out.println("Вывод: " + div);

    }
}
