public class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String telephoneDigits;

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneDigits = validateAndNormalizeTelephone(telephoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephoneNumber() {
        return formatTelephone(telephoneDigits);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneDigits = validateAndNormalizeTelephone(telephoneNumber);
    }

    @Override
    public int compareTo(Contact other) {
        int byFirst = firstName.compareTo(other.firstName);
        if (byFirst != 0) {
            return byFirst;
        }
        int byLast = lastName.compareTo(other.lastName);
        if (byLast != 0) {
            return byLast;
        }
        return telephoneDigits.compareTo(other.telephoneDigits);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + formatTelephone(telephoneDigits);
    }

    public int compareByLastNameFirst(Contact other) {
        int byLast = lastName.compareTo(other.lastName);
        if (byLast != 0) {
            return byLast;
        }
        int byFirst = firstName.compareTo(other.firstName);
        if (byFirst != 0) {
            return byFirst;
        }
        return telephoneDigits.compareTo(other.telephoneDigits);
    }

    public boolean isDuplicateOf(Contact other) {
        return other != null && telephoneDigits.equals(other.telephoneDigits);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return telephoneDigits.equals(contact.telephoneDigits);
    }

    @Override
    public int hashCode() {
        return telephoneDigits.hashCode();
    }

    String getTelephoneDigits() {
        return telephoneDigits;
    }

    static String normalizeTelephone(String telephoneNumber) {
        return validateAndNormalizeTelephone(telephoneNumber);
    }

    private static String validateAndNormalizeTelephone(String telephoneNumber) {
        if (telephoneNumber == null) {
            throw new IllegalArgumentException("Telephone number is required.");
        }
        String trimmed = telephoneNumber.trim();
        if (trimmed.isEmpty()) {
            throw new IllegalArgumentException("Telephone number is required.");
        }

        if (trimmed.length() == 10 && trimmed.chars().allMatch(Character::isDigit)) {
            return trimmed;
        }

        if (trimmed.length() == 12 && trimmed.charAt(3) == '-' && trimmed.charAt(7) == '-') {
            String part1 = trimmed.substring(0, 3);
            String part2 = trimmed.substring(4, 7);
            String part3 = trimmed.substring(8, 12);
            if (part1.chars().allMatch(Character::isDigit)
                    && part2.chars().allMatch(Character::isDigit)
                    && part3.chars().allMatch(Character::isDigit)) {
                return part1 + part2 + part3;
            }
        }

        throw new IllegalArgumentException(
                "Telephone number must be 10 digits or formatted as XXX-XXX-XXXX.");
    }

    private static String formatTelephone(String tenDigits) {
        return tenDigits.substring(0, 3) + "-" + tenDigits.substring(3, 6) + "-" + tenDigits.substring(6, 10);
    }
}
