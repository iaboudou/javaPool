public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

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

    public void takeDamage(int arg) {
        setCurrentHealth(getCurrentHealth() - (arg - getShield()));
        if (getCurrentHealth()  < 0) {
            setCurrentHealth(0);
        }
    }

    public void attack(Character name) {
        heal(this);
        name.takeDamage(6);
    }

    public static void main(String[] args) {
        Templar alistair = new Templar("Alistair", 18, 2, 4);
        Sorcerer morrigan = new Sorcerer("Morrigan", 21, 5);
        Monster dragon = new Monster("Dragon", 12);

        dragon.attack(alistair);
        dragon.attack(morrigan);
        
        alistair.attack(dragon);
        morrigan.attack(dragon);

        System.out.println(Character.printStatus());
    }
}