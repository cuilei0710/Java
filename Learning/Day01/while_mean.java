public class while_mean {
    private static final double mounteverest = 8848;

    public static void main(String[] args) {
        System.out.println("---------How many times does it take to stack"
                + "paper to be taller than Mount Everest-----------");
        double x = 0.01;
        int count = 0;
        while (mounteverest > x) {
            x *= 2;
            count++;
        }
        System.out.println("Need to fold " + count);
    }
}
