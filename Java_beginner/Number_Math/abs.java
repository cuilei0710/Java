package Java_beginner.Number_Math;

public class abs {
    public static void main(String[] args) {
        Integer a = -8;
        double d = -100;
        float f = -90;

        System.out.println(Math.abs(a));
        System.out.println(Math.abs(d));
        System.out.println(Math.abs(f));
    }
}

/*学习方法
abs() 返回参数的绝对值。参数可以是 int, float, long, double, short, byte类型
语法：
各种类型的方法格式类似如下：
double abs(double d)
float abs(float f)
int abs(int i)
long abs(long lng)
参数：
任何原生数据类型
返回值
返回参数的绝对值 */