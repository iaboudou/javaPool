public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer( String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public void heal(Character ch) {
        int a = ch.getCurrentHealth() + healCapacity;
        if (a > ch.getMaxHealth()) {
            ch.setCurrentHealth(ch.getMaxHealth());
        }else {
            ch.setCurrentHealth(a);
        }
    }

    public String toString() {
        return getCurrentHealth() != 0
            ? String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(), this.getCurrentHealth(), getHealCapacity())
            : String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(), getHealCapacity());
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    public static void main(String[] args) {
        Sorcerer gandalf = new Sorcerer("Gandalf", 20, 5);
        Character frodon = new Character("Frodon", 20);
        Sorcerer saroumane = new Sorcerer("saroumane", 10, 3);

        Character.fight(frodon, saroumane);
        gandalf.heal(frodon);

        System.out.println(Character.printStatus());
        // System.out.println(gandalf);
    }
}