import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;

public class ContactList extends AbstractList<Contact> {

    private ArrayList<Contact> contactList;

    public ContactList() {
        contactList = new ArrayList<Contact>();
    }

    private int findInsertLocation(Contact contact) {
        int lo = 0;
        int hi = contactList.size();
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (contact.compareTo(contactList.get(mid)) > 0) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    @Override
    public boolean add(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException();
        }
        for (Contact c : contactList) {
            if (contact.isDuplicateOf(c)) {
                return false;
            }
        }
        int loc = findInsertLocation(contact);
        modCount++;
        contactList.add(loc, contact);
        return true;
    }

    public boolean remove(Contact contact) {
        return remove((Object) contact);
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact target = (Contact) o;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).equals(target)) {
                modCount++;
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Contact remove(int index) {
        modCount++;
        return contactList.remove(index);
    }

    public void sortByFirstName() {
        Collections.sort(contactList);
    }

    public void sortByLastName() {
        for (int i = 1; i < contactList.size(); i++) {
            Contact key = contactList.get(i);
            int j = i - 1;
            while (j >= 0 && contactList.get(j).compareByLastNameFirst(key) > 0) {
                contactList.set(j + 1, contactList.get(j));
                j--;
            }
            contactList.set(j + 1, key);
        }
    }

    public void sortByTelephoneNumber() {
        int n = contactList.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                String tj = contactList.get(j).getTelephoneDigits();
                String tMin = contactList.get(minIdx).getTelephoneDigits();
                if (tj.compareTo(tMin) < 0) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                Contact tmp = contactList.get(i);
                contactList.set(i, contactList.get(minIdx));
                contactList.set(minIdx, tmp);
            }
        }
    }

    public Contact searchContacts(String telephoneNumber) {
        String key = Contact.normalizeTelephone(telephoneNumber);
        for (Contact c : contactList) {
            if (c.getTelephoneDigits().equals(key)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    @Override
    public Contact get(int index) {
        return contactList.get(index);
    }

    @Override
    public int size() {
        return contactList.size();
    }

    @Override
    public void clear() {
        modCount++;
        contactList.clear();
    }
}
