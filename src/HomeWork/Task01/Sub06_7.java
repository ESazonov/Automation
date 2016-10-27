package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016.
 */
public class Sub06_7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        String box = "";

        for (int i = 1; i < nums.length - 1; i++) {
            if (((Integer.parseInt(nums[i - 1]) + Integer.parseInt(nums[i + 1])) / 2) == Integer.parseInt(nums[i])) {
                box += " " + nums[i];
            }
        }
        System.out.println("Вывод: " + box);
    }
}