package Java_beginner;

import java.util.Scanner;

public class two_num_add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program adds two numbers.");
        System.out.println("Enter n1:");
        // int n1 = readInt("Enter n1: ");.
        
        int n1 = in.nextInt();
        System.out.println("Enter n2:");
        int n2 = in.nextInt();
        n2 = n1 + n2;
        System.out.println("The total is " + n2);
        in.close();
    }
}
