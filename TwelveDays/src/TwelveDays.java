import java.util.Scanner;


public class TwelveDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Twelve Days you heathen");
        int increment = 1;

        while (increment < 12) {

            System.out.println("Enter a name");
            String name = scanner.nextLine();

            System.out.println("Enter a present");
            String present = scanner.nextLine();

            System.out.println("Enter a day");
            int day = scanner.nextInt();

            System.out.println("On the " + day + " day of christmas, " + name + " gave to me " + day + " " + present);
            increment++;

            if (increment == 12) {
                System.out.println("The twelve days are over. Merry christmas and keep on hacking, you goddamn females");
            }
        }
    }
}


