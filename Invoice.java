import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        int orderedShirts, orderedTrousers, point = 0;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int costOfShirts,costOfTrousers,totalCost;
        double discount, netPay;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of shirts to order:");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of trouser to order:");
        orderedTrousers = input.nextInt();

        costOfShirts = priceOfShirt * orderedShirts;
        costOfTrousers = priceOfTrouser * orderedTrousers;
        totalCost = costOfShirts + costOfTrousers;

        discount = totalCost > 3000 ? totalCost * 10 / 100 : 0;
        netPay = totalCost - discount;

        point = (int) (netPay > 3000 ? netPay / 100 :0);

        System.out.println("\nItem \t\t Quantity \t Price \t Total");
        System.out.println("------------------------------------------" +
                "------------------");
        System.out.printf("Shirt \t\t   %d \t\t  %d \t  %d \n", orderedShirts, priceOfShirt, costOfShirts);
        System.out.printf("Trouser \t   %d \t\t  %d \t  %d \n", orderedTrousers, priceOfTrouser, costOfTrousers);
        System.out.printf("Discount \t \t\t \t\t\t  %.2f \n", discount);
        System.out.println("------------------------------------------" +
                "------------------");
        System.out.printf("Net Total \t   \t\t  \t\t\t  %.2f \n", netPay);
        System.out.println("------------------------------------------" +
                "------------------");
        System.out.printf("Points Earned \t\t\t\t\t  %d \n", point);
        System.out.println("Thank you!\n");
    }
}
