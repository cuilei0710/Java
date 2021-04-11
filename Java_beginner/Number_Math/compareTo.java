package Java_beginner.Number_Math;

public class compareTo {
    public static void main(String[] args) {
        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(7));
    }
}

/*学习方法
语法
public int compareTo(NumberSubClass referenceName)
referenceName--可以是以Byte、Double、Integer、Float、Long或Short类型的参数
返回值
如果指定的数与参数相等返回0
如果指定的数小于参数返回-1
如果指定的数大于参数返回1
 */