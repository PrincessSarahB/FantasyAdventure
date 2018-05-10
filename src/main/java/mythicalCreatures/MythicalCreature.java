package mythicalCreatures;

public abstract class MythicalCreature implements Defendable {

    private String name;

    public MythicalCreature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
