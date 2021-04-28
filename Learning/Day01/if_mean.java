import java.util.Scanner;

public class if_mean {
    public static void main(String[] args) {
        System.out.print("Enter thr num: ");
        Scanner sc = new Scanner(System.in);
        int se = sc.nextInt();
        if (se >= 1 & se <= 3) {
            System.out.println("Spring");
        } else if (se >= 4 & se <= 6) {
            System.out.println("Summer");
        } else if (se >= 7 & se <= 9) {
            System.out.println("Autumn");
        } else if (se >= 10 & se <= 12) {
            System.out.println("Winter");
        } else {
            System.out.println("Please enter the number between 1 ~ 12!");
        }
        sc.close();
    }
}
