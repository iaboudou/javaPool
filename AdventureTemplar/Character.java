public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static java.util.List<Character> allCharacters = new java.util.ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public void setCurrentHealth(int currH) {
        currentHealth = currH;
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

    public static String printStatus() {
        String res = "------------------------------------------\n";
        if (allCharacters.size() == 0) {
            res += "Nobody's fighting right now !\n";
        }else {
            res += "Characters currently fighting :\n";
        }
        for (Character c : allCharacters) {
            res += " - " + c.toString() + "\n";
        }
        res += "------------------------------------------\n";
        return res;
    }

    public static Character fight(Character c1, Character c2) {

        for (;;) {
            c1.attack(c2);

            if (c2.getCurrentHealth() == 0) {
                return c1;
            }
            c2.attack(c1);

            if (c1.getCurrentHealth() == 0) {
                return c2;
            }
        }
    }
}