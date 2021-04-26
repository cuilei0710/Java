package NumberMath;

public class valueOf {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("444", 16); //使用16进制

        System.out.println(x);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
}

/*学习方法
语法：
该方法有以下几种语法格式
static Integer valueOf(int i)
static Integer valueOf(String s)
static Integer valueOf(String s, int radix)
参数：
i--Integer对象的整数
s--Integer对象的字符串
radix--在解析字符串s时使用的进制数，用于指定使用的进制数
返回值：
Integer valueOf(int i):返回一个表示指定的int值的Integer实例
Integer valueOf(String s):返回保存指定的String的值的Integer对象
Integer valueOf(String s, int radix):返回一个Integer对象，该对象中保存了一个用第二个参数提供的基数进行解析时从指定的String中提取的值
 */