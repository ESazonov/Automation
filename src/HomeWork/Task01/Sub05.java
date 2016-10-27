package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016.
 */
public class Sub05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        int s = 0, p = 1;
        for (int i = 0; i < nums.length; i++) {
            int atata = Integer.parseInt(args[i]);
            s += atata;
            p *= atata;
        }
        System.out.println("Сумма = " + s);
        System.out.println("Произв = " + p);
    }
}
