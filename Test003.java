class Grocery {
    int itemNo;
    String itemName;
    int Quantity;
    int Price;
    int total;

    public Grocery(int ItemNo, String ItemName, int Quantity, int Price) {
        this.itemNo = ItemNo;
        this.itemName = ItemName;
        this.Quantity = Quantity;
        this.Price = Price;
        this.total = Quantity * Price;
        displayItemDetails();
    }

    public void displayItemDetails() {
        System.out.println("Item No: " + itemNo);
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Price: " + Price);
        System.out.println("Total: " + total);

    }
}

public class Test003 {
    public static void main(String[] args) {
        Grocery g1 = new Grocery(1, "Apple", 5, 10);
        Grocery g2 = new Grocery(2, "Banana", 6, 20);

        System.out.println("***** Grocery Bill *****");
        g2.displayItemDetails();
        g1.displayItemDetails();

        int totalBill = g2.total + g1.total;
        System.out.println("Total Bill: " + totalBill);

    }
}