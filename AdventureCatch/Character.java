public abstract class Character {
    private Weapon weapon;
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static java.util.List<Character> allCharacters = new java.util.ArrayList<>();

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = this.currentHealth = maxHealth;
        allCharacters.add(this);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    protected void setCurrentHealth(int currH) {
        currentHealth = currH;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        String s = String.format("He has the weapon %s.", weapon.toString());
        return currentHealth == 0 
            ? String.format("%s : KO", name) + s
            : String.format("%s : %d/%d", name, currentHealth, maxHealth ) + s;
    }

    public abstract void takeDamage(int arg) throws DeadCharacterException;
    public abstract void attack(Character name) throws DeadCharacterException;

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

        try {
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
        } catch(DeadCharacterException d) {
            return null;
        }
    }
}