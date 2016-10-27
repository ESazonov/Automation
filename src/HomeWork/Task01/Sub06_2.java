package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016..
 */
public class Sub06_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");

        int min = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (Integer.parseInt(nums[i]) < min || i == 0) {
                min = Integer.parseInt(nums[i]);
            }

            if (Integer.parseInt(nums[i]) > max || i == 0) {
                max = Integer.parseInt(nums[i]);
            }
        }

        System.out.println("Мин: " + min);
        System.out.println("Макс: " + max);
    }
}
