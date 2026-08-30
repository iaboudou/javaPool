public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    public String toString() {
        return this.getCurrentHealth() > 0 
            ? String.format("%s is a monster with %d HP", this.getName() , this.getCurrentHealth())
            : String.format("%s is a monster and is dead", this.getName());
    }

    public void takeDamage(int arg) {
        setCurrentHealth(getCurrentHealth() - (int) Math.floor(arg *80 / 100));
        if (getCurrentHealth()  < 0) {
            setCurrentHealth(0);
        }
    }

    public void attack(Character name) {
        name.takeDamage(7);
    }

}