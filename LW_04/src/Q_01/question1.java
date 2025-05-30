package Q_01;

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int smallest = num1;


        if (num2 < smallest) { smallest = num2;
        }

        if (num3 < smallest) { smallest = num3;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}