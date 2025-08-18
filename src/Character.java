public class Character {
    private String name;
    private String weapon;
    private int attack;

    public Character(String name, String weapon, int attack) {
        this.name = name;
        this.weapon = weapon;
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", attack=" + attack +
                '}';
    }
}
