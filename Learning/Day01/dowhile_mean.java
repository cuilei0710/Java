public class dowhile_mean {
    public static void main(String[] args) {
        int n = 1;
        do {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
        } while (n <= 5);
    }
}
