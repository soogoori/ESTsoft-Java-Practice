package Weekly_2_deep;

import java.math.BigDecimal;

public class Product implements DeliveryChargeCalculator {
    private String name;
    private BigDecimal price;
    private Double weight;

    public Product(String name, BigDecimal price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public Double getWeight(){
        return this.weight;
    }

    @Override
    public BigDecimal getDeliveryCharge(Double weight, BigDecimal price) {

        BigDecimal charge;

        if (weight < 3 && weight>=0) charge = BigDecimal.valueOf(1000);
        else if(weight>=3 && weight<10) charge= BigDecimal.valueOf(5000);
        else charge = BigDecimal.valueOf(10000);


        if(price.compareTo(BigDecimal.valueOf(30000)) < 0 && price.compareTo(BigDecimal.valueOf(0))>=0) return charge;
        else if(price.compareTo(BigDecimal.valueOf(3000))>=0
                && price.compareTo(BigDecimal.valueOf(100000))<0) return charge.subtract(BigDecimal.valueOf(1000));
        else return BigDecimal.ZERO;
    }
}
