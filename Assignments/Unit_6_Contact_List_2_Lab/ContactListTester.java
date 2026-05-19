import java.util.ArrayList;
import java.util.Arrays;

public class ContactListTester {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<Contact>(
                Arrays.asList(
                        new Contact("Alice", "A", "111-111-1111"),
                        new Contact("Tommy", "T", "222-222-2222"),
                        new Contact("Bobby", "B", "333-333-3333"),
                        new Contact("Annabelle", "A", "444-444-4444"),
                        new Contact("Samantha", "S", "555-555-5555"),
                        new Contact("Samuel", "S", "666-666-6666"),
                        new Contact("Alice", "B", "111-111-1111")));

        ContactList contactList = new ContactList();

        System.out.println("=== Testing Adding Contacts ===");
        for (Contact c : contacts) {
            contactList.add(c);
            System.out.println(contactList);
        }

        String expectedAfterAdd =
                "Contact List: [Alice A, 111-111-1111, Annabelle A, 444-444-4444, Bobby B, 333-333-3333, "
                        + "Samantha S, 555-555-5555, Samuel S, 666-666-6666, Tommy T, 222-222-2222]";
        if (contactList.toString().equals(expectedAfterAdd)) {
            System.out.println("=== Adding Contacts PASSED! === \n");
        } else {
            System.out.println("=== Adding Contacts FAILED! === \n");
        }

        System.out.println("=== Testing Removing Contacts ===");

        contactList.remove(new Contact("X", "Y", "333-333-3333"));
        System.out.println(contactList);

        contactList.remove(new Contact("X", "Y", "111-111-1111"));
        System.out.println(contactList);

        contactList.add(new Contact("Fred", "F", "777-777-7777"));
        System.out.println(contactList);

        contactList.add(new Contact("Xena", "X", "888-888-8888"));
        System.out.println(contactList);

        contactList.remove(new Contact("X", "Y", "222-222-2222"));
        System.out.println(contactList);

        contactList.remove(new Contact("X", "Y", "777-777-7777"));
        System.out.println(contactList);

        contactList.remove(new Contact("X", "Y", "444-444-4444"));
        System.out.println(contactList);

        contactList.remove(new Contact("X", "Y", "555-555-5555"));
        System.out.println(contactList);

        String expectedFinal =
                "Contact List: [Samuel S, 666-666-6666, Xena X, 888-888-8888]";
        if (contactList.toString().equals(expectedFinal)) {
            System.out.println("=== Removing Contacts PASSED! === \n");
        } else {
            System.out.println("=== Removing Contacts FAILED! === \n");
        }

        System.out.println("=== searchContacts ===");
        System.out.println(contactList.searchContacts("666-666-6666"));
        System.out.println(contactList.searchContacts("000-000-0000"));
    }
}
