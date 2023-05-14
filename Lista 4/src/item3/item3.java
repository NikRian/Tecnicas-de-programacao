package item3;

public class item3 {
    public static void main(String[] args) {
        
        invoice bill = new invoice(8, 20, 5.0, "pendrive");

        bill.setDiscount(50);

        bill.recip();
    }
}