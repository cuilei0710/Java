package Java_beginner;

import java.util.Scanner;

public class change_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入还剩余多少");
        double change = in.nextDouble();
        System.out.println("过去了多少年");
        change = (13.6 - change) * (5730.0 / 6.8);
        System.out.println(change);
        in.close();
    }

}
