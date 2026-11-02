public class Receipt {
    public static void main(String[] args) {
       
        int numberOfCoffees = 10;
        double pricePerCoffee = 1.5;
        char currencySymbol = '$';
        boolean isToGo = true;
        double taxRate = 0.10; 

        double subtotal = numberOfCoffees * pricePerCoffee; 
        double tax = subtotal * taxRate;                   
        double total = subtotal + tax;                   

        System.out.println("=========================================");
        System.out.println("           JAVA CAFE RECEIPT             ");
        System.out.println("=========================================");
        System.out.println("Quantity Purchased    : " + numberOfCoffees);
        System.out.println("Price Per Item        : " + currencySymbol + pricePerCoffee);
        System.out.println("Takeout Order         : " + isToGo);
        System.out.println("-----------------------------------------");
        System.out.println("Subtotal              : " + currencySymbol + subtotal);
        System.out.println("Tax (10%)              : " + currencySymbol + tax);
        System.out.println("-----------------------------------------");
        System.out.println("Total Due             : " + currencySymbol + total);
        System.out.println("=========================================");
    }
}
