import Weekly_2_basic.*;
import Weekly_3.AddressBook;
import Weekly_3.BusinessContact;
import Weekly_3.PersonalContact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        week3();
    }

    static void week2(){
        Product grocery = new Grocery("시리얼", 30000, 2.0);
        Product beauty = new Beauty("선크림", 20000, 3.0);
        Product largeAppliance = new LargeAppliance("세탁기", 50000, 5.0);

        /*int groceryDeliveryCharge = grocery.getDeliveryCharge(grocery.getWeight(), grocery.getPrice());
        int beautyDeliveryCharge = beauty.getDeliveryCharge(beauty.getWeight(), beauty.getPrice());
        int largeApplianceDeliveryCharge = largeAppliance.getDeliveryCharge(largeAppliance.getWeight(), largeAppliance.getPrice());

        System.out.println( grocery.getName()+ " 배송비 : " + groceryDeliveryCharge);
        System.out.println(beauty.getName() + " 배송비 : " + beautyDeliveryCharge);
        System.out.println(largeAppliance.getName() + " 배송비 : " + largeApplianceDeliveryCharge);*/

        Cart cart = new Cart(new Product[]{grocery, beauty, largeAppliance});
        int totalDeliveryCharge = cart.calculateDeliveryCharge();

        int discountAmount = grocery.getDiscountAmount() + beauty.getDiscountAmount() + largeAppliance.getDiscountAmount();


        System.out.println("총 배송비 : " + totalDeliveryCharge);
        System.out.println("총 할인금액 : " + discountAmount);
    }
    static void week3(){
        AddressBook addressBook = new AddressBook();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("============================");
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.println("============================");
            System.out.print("메뉴를 선택해주세요: ");
            System.out.println();

            int choice = sc.nextInt();
            sc.nextLine(); // 개행문자 소비

            switch (choice) {
                case 1 :
                    System.out.println("*** 비즈니스 연락처 추가를 선택하셨습니다. ***");
                    System.out.print("이름을 입력하세요: ");
                    String name = sc.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("회사명을 입력하세요: ");
                    String company = sc.nextLine();

                    BusinessContact businessContact = new BusinessContact(name, phoneNumber, company);
                    addressBook.addContact(businessContact);
                    break;

                case 2 :
                    System.out.println("*** 개인 연락처 추가를 선택하셨습니다. ***");
                    System.out.print("이름을 입력하세요: ");
                    String personalName = sc.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String personalPhoneNumber = sc.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String relationship= sc.nextLine();

                    PersonalContact personalContact = new PersonalContact(personalName, personalPhoneNumber, relationship);
                    addressBook.addContact(personalContact);
                    break;

                case 3 :
                    System.out.println("*** 연락처 출력을 선택하셨습니다. ***");
                    addressBook.displayContact();
                    break;

                // 여기에 연락처 출력하는 코드 추가
                case 4 :
                    System.out.println("*** 연락처 검색을 선택하셨습니다. ***");
                    System.out.println("검색할 이름을 입력하세요: ↵");
                    String searchName = sc.nextLine();
                    addressBook.searchContact(searchName);
                    break;

                case 5 :
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default : System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요.");
            }
        }
    }
}