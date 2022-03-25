import java.io.Serializable;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GameProgress{");
        sb.append("health=").append(health);
        sb.append(", weapons=").append(weapons);
        sb.append(", lvl=").append(lvl);
        sb.append(", distance=").append(distance);
        sb.append('}');
        return sb.toString();
    }

}
