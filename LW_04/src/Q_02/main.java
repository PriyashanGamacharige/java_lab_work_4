package Q_02;
import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println("Select one color from the above list:");
        int selection = scanner.nextInt();
        String color;
        switch (selection) {
            case 0:
                color = "Magenta";
                break;
            case 1:
                color = "Cyan";
                break;
            case 2:
                color = "Red";
                break;
            case 3:
                color = "Blue";
                break;
            case 4:
                color = "Green";
                break;
            default:
                color = null;
                break;
        }
        if (color != null) {
            System.out.println("You selected " + color);
        } else {
            System.out.println("Invalid selection");
        }
    }
}
