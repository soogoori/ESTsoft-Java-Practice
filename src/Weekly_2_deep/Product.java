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

        if (weight < NumConstants.MINIMUM_WEIGHT && weight>=0)
            charge = BigDecimal.valueOf(NumConstants.MINIMUM_WEIGHT_FEE);
        else if(weight>=NumConstants.MINIMUM_WEIGHT && weight<NumConstants.MAXIMUM_WEIGHT)
            charge= BigDecimal.valueOf(NumConstants.MIDDLE_WEIGHT_FEE);
        else charge = BigDecimal.valueOf(NumConstants.MAXIMUM_WEIGHT_FEE);


        if(price.compareTo(BigDecimal.valueOf(NumConstants.DELIVERY_DISCOUNT_PROD_PRICE)) < 0
                && price.compareTo(BigDecimal.ZERO)>=0)
            return charge;
        else if(price.compareTo(BigDecimal.valueOf(NumConstants.DELIVERY_DISCOUNT_PROD_PRICE))>=0
                && price.compareTo(BigDecimal.valueOf(NumConstants.DELIVERY_FREE_PROD_PRICE))<0)
            return charge.subtract(BigDecimal.valueOf(NumConstants.DELIVERY_DISCOUNT_FEE));
        else return BigDecimal.ZERO;
    }
}
