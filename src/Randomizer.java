import java.util.Random;

public class Randomizer {
    static String[] names = {"Vasya", "Optimus Prime", "Spiderman", "Donald Duck", "Mimo Krokodil"};
    static String[] weapons = {"Sword", "Katana", "Dubina", "Magic wand"};


    public static Character createNewRandomCharacter() {
        Random random = new Random();
        String name = names[random.nextInt(names.length)];
        String weapon = weapons[random.nextInt(weapons.length)];
        int attack = random.nextInt(100);

        return new Character(name, weapon, attack);
    }
}
