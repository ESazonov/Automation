package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016.
 */
public class Sub06_1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.print("Введите челое число: ");

        if (sr.hasNextInt()) {
            int number = sr.nextInt();
            String category = (number % 2) == 0 ? "Четное" : "Нечетное";

            System.out.println(category + " число: " + number);
        }
    }
}