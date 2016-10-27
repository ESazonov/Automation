package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016..
 */
public class Sub01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String youName = sc.nextLine();
            System.out.println(("Привет:" + " ") + youName);
        }
    }
}
