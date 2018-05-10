package mythicalCreatures;

public class Ogre extends MythicalCreature {

    public Ogre(String name) {
        super(name);
    }

    public String defend() {
        return getName() + " blocks attack!";
    }
}
