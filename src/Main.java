//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String item;
        double price;
        int quantity;
        String currency="Rupees";
        double total;
        System.out.println("What item would you like to buy? : ");
        item=scanner.nextLine();

        System.out.println("What is the price for each? : ");
        price= scanner.nextDouble();

        System.out.println("How many would you like? : ");
        quantity= scanner.nextInt();

        total=price*quantity;

        System.out.println("\n You have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is : "+total+currency);

        scanner.close();

    }
    }
