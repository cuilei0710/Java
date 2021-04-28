public class test {
    public static void main(String[] args) {
        int count = 0;
        int num = 100;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
