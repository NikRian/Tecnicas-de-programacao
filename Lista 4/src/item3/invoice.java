package item3;

public class invoice  {

    private int number, quantity;
    
    private double  price;

    private String description;

    public invoice(int number, int quantity, double price, String description) {

        this.number = 0;
        this.quantity = 0;
        this.price = 0.0;
        this.description = description;

        if(number > 0) {
            this.number = number;
        }

        if(quantity > 0) {
            this.quantity = quantity;
        }

        if(price > 0) {
            this.price = price;
        }
    }

    public void setDiscount(int percent) {
        if (percent > 0) {
            this.price -= (this.price*percent/100);
        } else {
            System.out.println("Por favor insira um desconto válido.");
            System.exit(0);
        }
    }

    public void recip() {
        System.out.println("Código de item: "+number+"\nQuantidade: "+quantity+"\nPreço individual: R$"+price+"\nDescrição: "+description+"\nValor total a ser pago: R$"+getTotalPrice());
    }

    public double getTotalPrice() {
        price *= quantity;
        return price;
    }

    public int getNumber() {
        return number;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
