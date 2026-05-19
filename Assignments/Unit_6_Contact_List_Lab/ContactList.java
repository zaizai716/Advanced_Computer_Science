import java.util.AbstractList;
import java.util.ArrayList;

public class ContactList extends AbstractList<String> {

    private ArrayList<String> contactList;

    public ContactList() {
        contactList = new ArrayList<String>();
    }

    /**
     * Returns the index where {@code name} belongs to keep the list sorted.
     * If {@code name} equals an existing entry, that entry's index is returned.
     */
    private int findInsertLocation(String name) {
        int lo = 0;
        int hi = contactList.size();
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (name.compareTo(contactList.get(mid)) > 0) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    @Override
    public boolean add(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        System.out.println("+ Adding " + name);
        int loc = findInsertLocation(name);
        if (loc < contactList.size() && contactList.get(loc).compareTo(name) == 0) {
            return false;
        }
        contactList.add(loc, name);
        return true;
    }

    public void add(ArrayList<String> names) {
        if (names == null) {
            throw new IllegalArgumentException();
        }
        for (String name : names) {
            add(name);
        }
    }

    public boolean remove(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        System.out.println("- Removing " + name);
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).compareTo(name) == 0) {
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void remove(ArrayList<String> names) {
        if (names == null) {
            throw new IllegalArgumentException();
        }
        for (String name : names) {
            remove(name);
        }
    }

    public String toString() {
        return "Contact List: " + contactList.toString();
    }

    @Override
    public String get(int index) {
        return contactList.get(index);
    }

    @Override
    public int size() {
        return contactList.size();
    }

    @Override
    public void clear() {
        System.out.println("Clearing the contact list");
        contactList.clear();
    }

}
