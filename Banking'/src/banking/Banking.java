package banking;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank obj = new Bank();
        Scanner sc = new Scanner(System.in);
        obj.acceptDetails();
        int ch = 1;
        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");

            ch = sc.nextInt();
            if (ch == 5) {
                System.out.println("Thank You");
                break;
            } else {
                switch (ch) {
                    case 1:
                        obj.deposit();
                        break;
                    case 2:
                        obj.withdraw();
                        break;
                    case 3:
                        obj.viewBalance();
                        break;
                    case 4:
                        obj.displayDetails();
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            }

        }
    }

}
