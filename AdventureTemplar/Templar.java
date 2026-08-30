public class Templar extends Character implements Healer, Tank {
    private int healCapacity;
    private int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;

    }

    public void heal(Character ch) {
        int a = ch.getCurrentHealth() + healCapacity;
        if (a > ch.getMaxHealth()) {
            ch.setCurrentHealth(ch.getMaxHealth());
        }else {
            ch.setCurrentHealth(a);
        }
    }

    public int getHealCapacity() {
        return healCapacity;
    }
    public int getShield() {
        return shield;
    }

    public String toString() {
        return this.getCurrentHealth() != 0 
            ? String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", getName(), getCurrentHealth(), getHealCapacity(), getShield() )
            : String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",getName(), getShield(), getHealCapacity() );
    }

    public static void main(String[] args) {
        Templar alistair = new Templar("Alistair", 20, 5, 4);
        Templar roderick = new Templar("Roderick", 10, 3, 2);

        Character.fight(alistair, roderick);

        alistair.heal(alistair);

        System.out.println(Character.printStatus());
    }
}
