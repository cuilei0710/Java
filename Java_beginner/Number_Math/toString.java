package Java_beginner.Number_Math;

public class toString {
    public static void main(String[] args) {
        Integer x = 5;

        System.out.println(x.toString());
        System.out.println(Integer.toString(1545448));
    }
}

/*学习方法
toString() 方法用于返回以一个字符串表示的 Number 对象值。
如果方法使用了原生的数据类型作为参数，返回原生数据类型的 String 对象值。
如果方法有两个参数， 返回用第二个参数指定基数表示的第一个参数的字符串表示形式。
语法：
以String类为例，该方法有以下几种语法格式
String toString()
static String toString(int i)
参数：
i--要转换的整数
返回值：
toString():返回表示Integer值的String对象
toString(int i):返回表示指定int的String对象
*/