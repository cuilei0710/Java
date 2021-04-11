package Java_beginner.Number_Math;

public class equals {
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        short a = 5;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));
    }
}

/*学习方法
语法
public boolean equals(Object o)
o--任何对象
返回值
如Number对象不为NULL，且与方法的参数类型与数值都相等返回TRUE，否者返回FALSE
Double和Float对象还有一些额外的条件，可以参阅API手册*/