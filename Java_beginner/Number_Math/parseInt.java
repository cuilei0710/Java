package Java_beginner.Number_Math;

public class parseInt {
    public static void main(String[] args) {
        int x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444", 16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }
}

/*学习方法
parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
语法：
所有Number派生类parseInt方法格式类型如下：
static int parseInt(String s)
static int parseInt(String s, int radix)
参数：
s--十进制表示的字符串
radix--指定的基数
返回值：
parseInt(String s): 返回用十进制参数表示的整数值
parseInt(int i)：使用指定基数的字符串参数表示的整数(基数可以是10，2，8或16等进制数)
*/