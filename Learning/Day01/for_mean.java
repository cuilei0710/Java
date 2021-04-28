import java.util.Scanner;

public class for_mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_s, num_e;
        System.out.println("------------from start to end, find the number of daffodils------------");
        System.out.print("Please enter start and end: ");
        num_s = sc.nextInt();
        num_e = sc.nextInt();
        for (int i = num_s; i <= num_e; i++) {
            if (judge(i))
                System.out.println(i);
        }
        sc.close();
    }

    public static boolean judge(int num) {
        int a = 0, sum1 = 0,sum2 = num;
        int b = count(num);
        while (num != 0) {
            a = num % 10;
            num = num / 10;
            sum1 += Math.pow(a, b);
        }
        return (sum1 == sum2);
    }

    public static int count(int num) {
        int co = 0;
        while (num != 0) {
            num /= 10;
            co++;
        }
        return co;
    }
}
