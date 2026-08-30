public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    public String toString() {
        return this.getCurrentHealth() > 0 
            ? String.format("%s is a monster with %d HP", this.getName() , this.getCurrentHealth())
            : String.format("%s is a monster and is dead", this.getName());
    }

    public static void main(String[] args) {
        Character aragorn = new Character("Aragorn", 20);
        Monster slime = new Monster("Slime", 15);

        System.out.println(Character.printStatus());
        Character winner = Character.fight(aragorn, slime);
        System.out.println(Character.printStatus());
    }
}