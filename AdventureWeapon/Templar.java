public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
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
        String r = String.format(" He has the weapon %s", getWeapon().toString());
        return this.getCurrentHealth() != 0 
            ? String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.", getName(), getCurrentHealth(), getHealCapacity(), getShield()) + r
            : String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",getName(), getShield(), getHealCapacity() ) + r;
    }

    public void takeDamage(int arg) {
        setCurrentHealth(getCurrentHealth() - (arg - getShield()));
        if (getCurrentHealth()  < 0) {
            setCurrentHealth(0);
        }
    }

    public void attack(Character name) {
        heal(this);
        name.takeDamage(getWeapon() != null ? getWeapon().getDamage() : 6);
    }
}