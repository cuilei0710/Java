import java.util.Scanner;

public class boolean_mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("----------jude x and y, if x > y return true, else return false----------");
        System.out.print("Please enter x and y: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(judge(x, y));
        sc.close();
    }

    public static boolean judge(int a, int b) {
        return (a > b);
    }
}
