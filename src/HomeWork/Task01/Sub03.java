package HomeWork.Task01;

import java.util.Scanner;

/**
 * Created by Admin on 27.10.2016..
 */
public class Sub03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int name = scan.nextInt();
        scan.close();

        for (int i=1;i<= name;i++){
            System.out.println( (int)(Math.random() * 100));
        }

        for (int i=1;i<= name;i++){
            System.out.print((int)(Math.random() * 100) + " ");
        }
    }

}
