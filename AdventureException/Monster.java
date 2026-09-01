public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    public String toString() {
        String s = String.format(" He has the weapon %s", getWeapon().toString());
        return this.getCurrentHealth() > 0 
            ? String.format("%s is a monster with %d HP.", this.getName() , this.getCurrentHealth()) + s
            : String.format("%s is a monster and is dead.", this.getName()) + s;
    }

    public void takeDamage(int arg) {
        setCurrentHealth(getCurrentHealth() - (int) Math.floor(arg *80 / 100));
        if (getCurrentHealth()  < 0) {
            setCurrentHealth(0);
        }
    }

    public void attack(Character name) {
        name.takeDamage(getWeapon() != null ? getWeapon().getDamage() : 7);
    }

}