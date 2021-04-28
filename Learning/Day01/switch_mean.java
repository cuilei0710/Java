import java.util.Scanner;

public class switch_mean {
    private static final int DAY_28 = 28;
    // 平年的二月是28天
    private static final int DAY_29 = 29;
    // 闰年的二月是29天
    private static final int DAY_30 = 30;
    private static final int DAY_31 = 31;
    // final修饰表示不可更改
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, date;
        year = sc.nextInt();
        month = sc.nextInt();
        date = sc.nextInt();
        int date_inyear = Calculate(year, month, date);
        System.out.println(date_inyear + " Total in " + year + " year.");
        sc.close();
    }

    public static int Calculate(int y, int m, int d) {
        int total_day = 0;
        switch (m) {
        case 12:
            total_day += DAY_30;
            //12月份加的是11月份的日期，以此类推
        case 11:
            total_day += DAY_31;
        case 10:
            total_day += DAY_30;
        case 9:
            total_day += DAY_31;
        case 8:
            total_day += DAY_31;
        case 7:
            total_day += DAY_30;
        case 6:
            total_day += DAY_31;
        case 5:
            total_day += DAY_30;
        case 4:
            total_day += DAY_31;
        case 3:
            if ((y / 4 == 0) & (y / 100 != 0) || (y / 400 == 0))
                total_day += DAY_29;
            else
                total_day += DAY_28;
        case 2:
            total_day += DAY_31;
        case 1:
            total_day += d;
            //一月份加的是自己本身的日期
        default:
            break;
        }
        return total_day;
    }
}
