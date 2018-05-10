package mythicalCreatures;

public class Ogre extends MythicalCreature {


    public Ogre(String name) {
        super(name, 12);
    }

    public String defend() {
        return getName() + " blocks attack!";
    }
}
