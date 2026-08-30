public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = this.currentHealth = maxHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return currentHealth == 0 
            ? String.format("%s : KO", name) 
            : String.format("%s : %d/%d", name, currentHealth, maxHealth );
    }

    public void takeDamage(int arg) {
        currentHealth = currentHealth - arg;
        if (currentHealth  < 0) {
            currentHealth = 0;
        }
    }

    public void attack(Character name) {
        name.takeDamage(9);
    }
    
    public static void main(String[] args) {
        Character aragorn = new Character("Aragorn", 20);
        Character uruk = new Character("Uruk", 5);
        
        System.out.println(aragorn.toString()); // Aragorn : 20/20
        System.out.println(uruk.toString()); // Uruk : 5/5
        
        aragorn.attack(uruk);
        System.out.println(uruk.toString()); // Uruk : KO

        aragorn.takeDamage(12);
        System.out.println(aragorn.toString()); // Aragorn : 8/20
    }
}