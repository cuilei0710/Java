package NumberMath;

public class floor {
    public static void main(String[] args) {
        double d = 100.675;
        float f = -90;

        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));
        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));
    }
}

/*学习方法
floor() 方法可对一个数进行下舍入，返回给定参数最大的整数，该整数小于或等给定的参数
语法：
该方法有以下几种语法格式：
double floor(double d)
double floor(float f)
参数：
double或float的原生数据类型
返回值：
返回double类型数据，小于或等于给定的参数
 */