package mythicalCreatures;

public class Dragon extends MythicalCreature {

    public Dragon(String name) {
        super(name, 15);
    }

    public String defend() {
        return getName() + " guards with huge wings!";
    }
}
