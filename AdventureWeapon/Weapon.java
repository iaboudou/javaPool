public class Weapon {
    private final String name;
    private final int damage;

    public Weapon(String name , int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }

    public String toString() {
        return String.format("%s deals %d damages", getName(), getDamage() );
    }

    public static void main(String[] args) {
        Weapon narsil = new Weapon("Narsil", 15);
        Weapon baguette = new Weapon("Baguette magique", 20);
        Weapon massue = new Weapon("Massue", 8);
        Monster troll = new Monster("Troll", 30,  massue);
        Sorcerer dumbledore = new Sorcerer("Dumbledore", 25, 5, baguette);
        Templar alistair = new Templar("Alistair", 18, 2, 3, narsil);

        Character.fight(alistair, troll);

        System.out.println(Character.printStatus());
    }
}

/*
Characters currently fighting :
 - Troll is a monster and is dead. He has the weapon Massue deals 8 damages.
 - Dumbledore is a sorcerer with 25 HP. It can heal 5 HP. He has the weapon Baguette magique deals 20 damages.
 - Alistair is a strong Templar with 12 HP. It can heal 2 HP and has a shield of 3. He has the weapon Narsil deals 15 damages.
 */