package Weekly_2_basic;

public class Cart {

    private Product[] products;
    public Cart(Product[] products) {
        this.products=products;
    }

    public int calculateDeliveryCharge(){
        int totalDeliveryCharge = 0;

        for (Product product : products) {
            totalDeliveryCharge += product.getDeliveryCharge(product.getWeight(), product.getPrice());
        }

        return totalDeliveryCharge;
    }
}
