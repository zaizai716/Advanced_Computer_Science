public class Player {
    private int health;
    private String name;

    public Player(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public Player(String name) {
        this(name, 1000);
    }

    public Player(int health) {
        this("Justin", health);
    }

    public Player() {
        this("Fraud", 100);
    }

    // overloading
    // overloading happens when you have same method but different parameters
    public void eat(Food food) {
        System.out.println(name + "ate food.");
        health += food.getNutrition();
        System.out.println(health);
    }

    public void eat(Rock rock) {
        System.out.println(name + "ate rocks.");
        health -= 100;
        System.out.println(health);
    }

    public static void main(String[] args) {
        Player player = new Player("Justin", 100);

        Food sushi = new Food("Sushi", 50);
        player.eat(sushi);

        Food pizza = new Food("Pizza", 10);
        player.eat(pizza);
    }
}
