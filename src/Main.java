import java.util.Scanner;

public class Main {
    void main(){
        Scanner scanner = new Scanner(System.in);

        double shippingRate = 0.02;
        double cost;
        double newCost;

        System.out.println("Input the cost of your item:");

        if(scanner.hasNextDouble()){
            cost = scanner.nextDouble();
            scanner.nextLine();

            if(cost >= 100){
                //Apply shipping
                newCost = cost * shippingRate + cost;
                System.out.println("Your new cost with shipping is " + newCost);
            }else{
                //Don't apply shipping
                System.out.println("Free shipping! Your item costs " + cost);
            }
        }else{
            String b = scanner.nextLine();
            System.out.println("\nBad input try again: "+b);
        }

        scanner.close();
    }
}
