import Weekly_2_basic.Beauty;
import Weekly_2_basic.Grocery;
import Weekly_2_basic.LargeAppliance;
import Weekly_2_basic.Product;

public class Main {
    public static void main(String[] args) {

        Product grocery = new Grocery("시리얼", 50000, 3.2);
        Product beauty = new Beauty("선크림", 50000, 0.02);
        Product largeAppliance = new LargeAppliance("세탁기", 1200000, 20.5);

        int groceryDeliveryCharge = grocery.getDeliveryCharge(grocery.getWeight(), grocery.getPrice());
        int beautyDeliveryCharge = beauty.getDeliveryCharge(beauty.getWeight(), beauty.getPrice());
        int largeApplianceDeliveryCharge = largeAppliance.getDeliveryCharge(largeAppliance.getWeight(), largeAppliance.getPrice());

        System.out.println( grocery.getName()+ " 배송비 : " + groceryDeliveryCharge);
        System.out.println(beauty.getName() + " 배송비 : " + beautyDeliveryCharge);
        System.out.println(largeAppliance.getName() + " 배송비 : " + largeApplianceDeliveryCharge);
    }
}