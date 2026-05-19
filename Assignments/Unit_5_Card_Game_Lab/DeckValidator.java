import java.util.ArrayList;
import java.util.Scanner;

/*
 * DeckValidator — deck validation and building (students implement).
 *
 * USEFUL METHODS FOR YOUR IMPLEMENTATIONS:
 *
 *   card.hasAbility()           -> true if the card has a real ability (not NONE)
 *   card.getAbility()           -> returns the Ability interface reference
 *   card.getAbility().getId()   -> returns "BASTION", "RIPPLE", "CLEAVE", or "NONE"
 *   card.getType()              -> returns the CardType enum (GRANITE, PARCHMENT, BLADE)
 *   card.getStrength()          -> returns the card's strength stat
 *   card.getHealth()            -> returns the card's health stat
 *
 *   CardType.fromText("granite")       -> returns CardType.GRANITE
 *   AbilityLibrary.fromText("bastion") -> returns the BastionAbility instance
 *
 *   createCard("name", type, str, hp, ability) -> creates the right subclass
 *       (Granite, Parchment, or Blade) based on the CardType
 */
public class DeckValidator {

    // ----------------------------
    // CHECKERS (students implement)
    // ----------------------------

    // Rule: no more than 3 total ability cards in the deck.
    // HINT: loop through the deck, use card.hasAbility() to count how many
    // cards have a real ability, and return true if the count is <= 3.
    public static boolean checkNoMoreThanThreeAbilityCards(ArrayList<Card> deck) {
        int count = 0;
        for (Card card : deck) {
            if (card.hasAbility())
                count++;
        }
        return count <= 3;
    }

    // Rule: no duplicate abilities in the deck (max one BASTION, one RIPPLE, one
    // CLEAVE).
    // HINT: loop through the deck, use card.getAbility().getId() to get
    // each ability's name, and check for duplicates.
    public static boolean checkNoDuplicateAbilities(ArrayList<Card> deck) {
        boolean hasBastion = false, hasRipple = false, hasCleave = false;
        for (Card card : deck) {
            String id = card.getAbility().getId();
            if (id.equals("BASTION")) {
                if (hasBastion) return false;
                hasBastion = true;
            } else if (id.equals("RIPPLE")) {
                if (hasRipple) return false;
                hasRipple = true;
            } else if (id.equals("CLEAVE")) {
                if (hasCleave) return false;
                hasCleave = true;
            }
        }
        return true;
    }

    // Rule: strength and health must be 1..5, and strength + health <= 6.
    // HINT: loop through the deck, use card.getStrength() and card.getHealth().
    public static boolean checkStatsInRange(ArrayList<Card> deck) {
        for (Card card : deck) {
            int str = card.getStrength();
            int hp = card.getHealth();
            if (str < 1 || str > 5 || hp < 1 || hp > 5 || str + hp > 6)
                return false;
        }
        return true;
    }

    // Returns true only if the deck is fully valid:
    // - deck has exactly 5 cards
    // - AND all checks above return true
    public static boolean isValidDeck(ArrayList<Card> deck) {
        if (deck == null || deck.size() != 5)
            return false;
        return checkNoMoreThanThreeAbilityCards(deck)
                && checkNoDuplicateAbilities(deck)
                && checkStatsInRange(deck);
    }

    // ----------------------------
    // DECK BUILDERS (students implement)
    // ----------------------------

    // Must create 5 cards, all 3/3, no abilities (use AbilityLibrary.NONE).
    // Use the Granite, Parchment, and Blade subclasses directly,
    // or use the createCard() helper below.
    public static ArrayList<Card> buildDefaultDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        deck.add(new CardGranite("Default1", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardParchment("Default2", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardBlade("Default3", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardGranite("Default4", 3, 3, AbilityLibrary.NONE));
        deck.add(new CardBlade("Default5", 3, 3, AbilityLibrary.NONE));
        return deck;
    }

    // Prompts the user 5 times using Scanner and validates inputs.
    // Required prompt order per card:
    // 1. name (String)
    // 2. type (granite / parchment / blade) -> use CardType.fromText()
    // 3. strength (int)
    // 4. health (int)
    // 5. ability (bastion / ripple / cleave / none) -> use
    // AbilityLibrary.fromText()
    //
    // Then use createCard() to build the right subclass from the parsed type.
    public static ArrayList<Card> buildUserDeck(Scanner sc) {
        ArrayList<Card> deck = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Card " + i + " ---");
            String name = null;
            CardType type = null;
            int strength = 0, health = 0;

            while (name == null || name.trim().isEmpty()) {
                System.out.print("Name: ");
                name = sc.nextLine();
            }

            while (type == null) {
                System.out.print("Type (granite/parchment/blade): ");
                type = CardType.fromText(sc.nextLine());
            }

            while (true) {
                System.out.print("Strength (1-5): ");
                strength = sc.nextInt();
                sc.nextLine();
                System.out.print("Health (1-5): ");
                health = sc.nextInt();
                sc.nextLine();
                if (strength >= 1 && strength <= 5 && health >= 1 && health <= 5 && strength + health <= 6)
                    break;
                System.out.println("Invalid stats. Strength and health must be 1-5, and strength+health <= 6.");
            }

            System.out.print("Ability (bastion/ripple/cleave/none): ");
            Ability ability = AbilityLibrary.fromText(sc.nextLine());

            deck.add(createCard(name.trim(), type, strength, health, ability));
        }
        return deck;
    }

    // ----------------------------
    // Helper: create a Card subclass from a CardType
    // ----------------------------

    // This is a FACTORY METHOD — it decides which subclass to instantiate
    // based on the CardType enum value. The caller doesn't need to know
    // about the specific subclasses; they just pass in the type and get
    // back a Card reference.
    public static Card createCard(String name, CardType type, int strength, int health, Ability ability) {
        switch (type) {
            case GRANITE:
                return new CardGranite(name, strength, health, ability);
            case PARCHMENT:
                return new CardParchment(name, strength, health, ability);
            case BLADE:
                return new CardBlade(name, strength, health, ability);
            default:
                return null;
        }
    }

    // ----------------------------
    // Optional helpers you may use
    // ----------------------------

    public static boolean isYes(String s) {
        if (s == null)
            return false;
        s = s.trim().toLowerCase();
        return s.equals("y") || s.equals("yes");
    }
}
