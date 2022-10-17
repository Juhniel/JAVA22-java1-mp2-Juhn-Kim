import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Customer customer = new Customer(0, 0);
        Product pepsiMax = new Product("Pepsi Max", 15, 3);
        Product apple = new Product("Granny Smith", 5, 5);
        SaleProduct kinderEgg = new SaleProduct("Kinder Egg", 8, 1, 0.5);

        int choice;
        do {
            System.out.println("1. Buy " + pepsiMax.getProductName() + ", " + pepsiMax.getProductPrice() + " SEK, "
                    + pepsiMax.getProductStock() + " left");
            System.out.println("2. Buy " + apple.getProductName() + ", " + apple.getProductPrice() + " SEK, "
                    + apple.getProductStock() + " left");
            System.out.println("3. Buy " + kinderEgg.getProductName() + ", " + kinderEgg.getDiscountedPrice() + " SEK, " + kinderEgg.getDiscount() +
                    "% - Discount, "
                    + kinderEgg.getProductStock() + " left ");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = s.nextInt();
            System.out.print("________________________________________________\n");

            switch(choice){
                case 1:
                    if(pepsiMax.getProductStock() == 0){
                        pepsiMax.setProductStock();
                    } else {
                        customer.setUpdateProductAmount();
                        pepsiMax.setProductStock();
                        customer.setUpdateProductSum(pepsiMax.getProductPrice());
                    }
                    break;
                case 2:
                    if(apple.getProductStock() == 0){
                        apple.setProductStock();
                    } else {
                        customer.setUpdateProductAmount();
                        apple.setProductStock();
                        customer.setUpdateProductSum(apple.getProductPrice());
                    }
                    break;
                case 3:
                    if(kinderEgg.getProductStock() == 0){
                        kinderEgg.setProductStock();
                    } else {
                        customer.setUpdateProductAmount();
                        kinderEgg.setProductStock();
                        customer.setUpdateProductSum(kinderEgg.getDiscountedPrice());
                    }
                    break;
                case 4:
                    System.out.println("You bought a total of: " + customer.getProductAmount() + " products." + " - " + "Total price: " + customer.getProductSum() + " SEK");
                    break;
            }
        }while (choice != 4);
    }
}
