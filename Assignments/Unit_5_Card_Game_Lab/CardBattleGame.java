import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * CardBattleGame — the main game loop (students implement).
 *
 * USEFUL METHODS YOU'LL NEED:
 *
 *   Card methods:
 *     card.applySelfOnPlay()              -> applies shield/bonusDamage from the card's ability
 *     card.getAbility().pingDamageOnPlay() -> how much ping damage this ability deals
 *     card.getAbility().cyclesOnPlay()     -> whether the card cycles to the bottom of the deck
 *     card.computeDamageAgainst(defender)  -> calculates damage with type multipliers
 *     card.takeDamage(amount)             -> reduces shield first, then health
 *     card.isDefeated()                   -> true if health <= 0
 *     card.getType()                      -> returns CardType (uses polymorphism!)
 *
 *   PlayerState methods:
 *     state.getDeck()                     -> returns the player's ArrayList<Card>
 *     state.getActive() / setActive(card) -> the currently active card (or null)
 *     state.hasAnythingLeft()             -> true if active card or cards remain in deck
 *     state.getPendingDamage() / setPendingDamage(int)
 *                                         -> stored Ripple damage for next drawn card
 */
public class CardBattleGame {

    // To-do: Implement the full game.
    // Must print:
    // == CARD CLASH ==
    // Starting: Player/Bot
    // Winner: Player/Bot
    public static String playGame(ArrayList<Card> playerDeck, ArrayList<Card> botDeck, Random rng) {
        PlayerState player = new PlayerState("Player", playerDeck);
        PlayerState bot = new PlayerState("Bot", botDeck);

        boolean playerFirst = rng.nextInt(2) == 0;
        System.out.println("== CARD CLASH ==");
        System.out.println("Starting: " + (playerFirst ? "Player" : "Bot"));

        PlayerState current = playerFirst ? player : bot;
        PlayerState other = playerFirst ? bot : player;

        while (player.hasAnythingLeft() && bot.hasAnythingLeft()) {
            drawAndPlayIfNeeded(current, other);
            if (!other.hasAnythingLeft())
                break;
            attackOnce(current, other);
            if (!other.hasAnythingLeft())
                break;
            PlayerState temp = current;
            current = other;
            other = temp;
        }

        String winner = bot.hasAnythingLeft() ? "Bot" : "Player";
        System.out.println("Winner: " + winner);
        return winner;
    }

    // ----- helpers you may implement or use -----

    // Draw top card if no active, apply on-play effects via card.applySelfOnPlay()
    public static void drawAndPlayIfNeeded(PlayerState self, PlayerState other) {
        if (self.getActive() != null)
            return;
        ArrayList<Card> deck = self.getDeck();
        while (!deck.isEmpty()) {
            Card card = deck.remove(0);
            int pending = self.getPendingDamage();
            self.setPendingDamage(0);
            if (pending > 0)
                card.takeDamage(pending);
            if (card.isDefeated())
                continue;
            card.applySelfOnPlay();
            int ping = card.getAbility().pingDamageOnPlay();
            if (ping > 0) {
                if (other.getActive() != null)
                    other.getActive().takeDamage(ping);
                else
                    other.setPendingDamage(other.getPendingDamage() + ping);
            }
            if (card.getAbility().cyclesOnPlay()) {
                deck.add(card);
                if (deck.size() == 1)
                    return;
            } else {
                self.setActive(card);
                return;
            }
        }
    }

    // One attack (self active attacks other active if both exist)
    public static void attackOnce(PlayerState attacker, PlayerState defender) {
        Card atk = attacker.getActive();
        Card def = defender.getActive();
        if (atk == null || def == null)
            return;
        int dmg = atk.computeDamageAgainst(def);
        def.takeDamage(dmg);
        if (def.isDefeated())
            defender.setActive(null);
    }

    // Optional local run (not graded)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Card> player = DeckValidator.buildDefaultDeck();
        ArrayList<Card> bot = DeckBuilderBot.buildBotDeck();

        if (!DeckValidator.isValidDeck(player)) {
            System.out.println("Player deck invalid!");
            return;
        }

        playGame(player, bot, new Random());
    }
}
