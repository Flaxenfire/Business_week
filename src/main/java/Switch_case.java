import java.util.Scanner;

public class Switch_case {
    public static void main(String [] args) {
        int num = 0;
        int count = 0;
        while (num > 10000 || num < 1) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Please input a number between 1 and 10000:");
            num = sc1.nextInt();
        }

        if (num % 2 == 0) {
            count++;
        }
        if (num % 4 == 0) {
            count++;
        }
        if (num % 6 == 0) {
            count++;
        }
        if (num % 8 == 0) {
            count++;
        }
        if (num % 10 == 0) {
            count++;
        }

        switch (count) {
            case 0:
                System.out.println("No score");
                break;
            case 1:
                System.out.println("very Low score");
                break;
            case 2:
                System.out.println("low score");
                break;
            case 3:
                System.out.println("medium score");
                break;
            case 4:
                System.out.println("high score");
                break;
            case 5:
                System.out.println("very high score");
                break;
        }
    }
}
