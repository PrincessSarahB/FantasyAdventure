package mythicalCreatures;

public class Dragon extends MythicalCreature {

    public Dragon(String name) {
        super(name);
    }

    public String defend() {
        return getName() + " guards with huge wings!";
    }
}