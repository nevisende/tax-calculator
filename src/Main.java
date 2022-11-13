import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double amount, kdvRatio, kdvAmount, totalAmount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the fee amount: ");
        amount = scanner.nextDouble();

        if(amount < 1000) {
            kdvRatio = 0.18;
        } else {
            kdvRatio = .8;
        }
        kdvAmount = amount * kdvRatio;
        totalAmount = amount + kdvAmount;
        System.out.println("The amount without KDV is : " + amount);
        System.out.println("The ratio of KDV is : " + kdvRatio);
        System.out.println("The amount of KDV is : " + kdvAmount);
        System.out.println("The total amount is : " + totalAmount);
    }
}
