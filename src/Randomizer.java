import java.util.Random;

public class Randomizer {
    private final static String[] names = {"Vasya", "Optimus Prime", "Spiderman", "Donald Duck", "Mimo Krokodil"};
    private final static String[] weapons = {"Sword", "Katana", "Dubina", "Magic wand"};
    private final static Random random = new Random();

    public static Character createNewRandomCharacter() {
        String name = names[random.nextInt(names.length)];
        String weapon = weapons[random.nextInt(weapons.length)];
        int attack = random.nextInt(100);

        return new Character(name, weapon, attack);
    }
}
