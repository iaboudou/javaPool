public class DeadCharacterException extends Exception {
    private Character character;
    public DeadCharacterException(Character ch) {
        character = ch;
    }

    public String getMessage() {
        return String.format("The %s %s is dead.", character.getClass().getName().toLowerCase(), character.getName());
    }

    public static void main(String[] args) {
        Weapon feu = new Weapon("Boule de feu", 7);
        Sorcerer triss = new Sorcerer("Triss Merigold", 30, 5, feu); 
        Templar geralt = new Templar("Geralt de Riv", 28, 2, 5, feu); 
        DeadCharacterException exceptionTriss = new DeadCharacterException(triss);
        DeadCharacterException exceptionGeralt = new DeadCharacterException(geralt);
        
        System.out.println(exceptionTriss.getMessage());
        System.out.println(exceptionGeralt.getMessage());
    }
}

// The sorcerer Triss Merigold is dead.
// The templar Geralt de Riv is dead.