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

    public void takeDamage(int arg) {
        setCurrentHealth(getCurrentHealth() - arg);
        if (getCurrentHealth()  < 0) {
            setCurrentHealth(0);
        }
    }

    public void attack(Character name) {
        heal(this);
        name.takeDamage(10);
    }
}