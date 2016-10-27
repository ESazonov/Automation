package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016.
 */
public class Sub04 {
    public static void main(String[] args) {
        System.out.println("Введите пароль:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        scan.close();
        if (name.equals("Test")) {
            System.out.println("Добро пожаловать" + " " + name);
        } else {
            System.out.println("Неправильный пароль");
        }
    }
}