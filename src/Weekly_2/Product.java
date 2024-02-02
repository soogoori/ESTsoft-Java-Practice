package Weekly_2;

public class Product implements DeliveryChargeCalculator {
    private String name;
    private int price;
    private Double weight;

    public Product(String name, int price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public Double getWeight(){
        return this.weight;
    }

    @Override
    public int getDeliveryCharge(Double weight, int price) {
        int charge;

        if (weight < 3 && weight>=0) charge = 1000;
        else if(weight>=3 && weight<10) charge=5000;
        else charge =10000;

        if(price<30000 && price>=0) return charge;
        else if(price>=30000 && price<100000) return charge-1000;
        else return 0;
    }
}
