package Java_beginner;

import java.util.Scanner;

public class fbhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Num: ");
        int num = input.nextInt();
        if(num < 0){
            System.out.print("Please set Num > 0!!!\n");
        }
        if(num == 1 || num == 2){
            System.out.println(1);
        }
        else{
            int first = 1,second =1,third = 0;
		    for(int i = 3; i<= num ;i++) {
			third = first + second;
			first = second;
			second = third;
		    }
		    System.out.println(third);
        }
        input.close();
    }
}
