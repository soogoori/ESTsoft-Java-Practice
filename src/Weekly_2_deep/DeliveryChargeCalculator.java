package Weekly_2_deep;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(Double weight, BigDecimal price);
}
