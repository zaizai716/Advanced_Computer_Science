package U0D2;

public class Zombie {


    // instance variables (attributes)
    // growl

    // walk with arms out
    // eat brains

    // methods (behaviors)
    // green
    String skinColor = "Green";
    // rot dead
    boolean isDead = true;
    // humans eaten
    int humansEaten = 0;

    public static void main(String[] args) {

        Zombie egalitarian = new Zombie();
        System.out.println(egalitarian.growl());

        Zombie totalitarian = new Zombie();
        System.out.println(totalitarian.growl());

        System.out.println(egalitarian.humansEaten());
        System.out.println(totalitarian.humansEaten());

    }

    public String growl(){
        return "graaahahahahahahahah";
    }

    // Challenge: make a new method that returns number of humans eaten
    public int humansEaten(){
        return humansEaten;
    }

}

