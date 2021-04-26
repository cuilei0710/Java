package NumberMath;

public class ceil {
    public static void main(String[] args) {
        double d = 100.675;
        float f = -90;

        System.out.println(Math.ceil(d));
        System.out.println(Math.ceil(f));

        System.out.println(Math.floor(d));
        System.out.println(Math.floor(f));
    }
}

/*学习方法
ceil() 方法可对一个数进行上舍入，返回值大于或等于给定的参数，类型为双精度浮点型
语法：
该方法有以下几种语法格式：
double ceil(double d)
double ceil(float f)
参数：
double或float的原生数据类型
返回值：
返回double类型，返回值大于或等于给定的参数
 */