package item4;

public class product {

    private boolean sold;
    private double price;
    private String name;
    private int quantity;

    public product (String name, int quantity, double price) {

        this.sold = false;
        this.name = name;
        this.quantity = 0;
        this.price = 0;

        if (quantity > 0) {
            this.quantity = quantity;
        }

        if (price > 0) {
            this.price = price;
        }
    }

    public void buyProduct () {

        if (sold == true) {
            System.out.println("produto já comprado");
            return;
        } else {
            this.sold = true;
        }

        double recip = price * quantity;

        if (price > 500) {

            recip -= (recip * 1/4);
            
        } else if (price > 200) {

            recip -= (recip * 1/5);

        } else if (price > 100) {

            recip -= (recip * 1/10);

        }

        System.out.println("Nome do produto: "+name+"\npreço individual: R$"+price+"\nPreço total a ser pago: R$" +recip);


    }
}
