package Weekly_3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void displayContact(){

        if(contacts.isEmpty())System.out.println("연락처가 비어있습니다.");
        else{
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void searchContact(String name){
        boolean flag=false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)){
                System.out.println(contact);
                flag = true;
            }
        }
        if(!flag) System.out.println("연락처를 찾을 수 없습니다.");
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
