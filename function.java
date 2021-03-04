import java.util.Scanner;

public class function {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = si(a ,b ,c);
        System.out.println(s);
        sc.close();
    }
    public static double si(int a, int b, int c){
        double d = ((-b) + Math.sqrt(b*b-4*a*c))/(2*a);
        double e = ((-b) - Math.sqrt(b*b-4*a*c))/(2*a);
        if(d > 0){
            return d;
        }
        else{
            return e;
        }
    }
}
