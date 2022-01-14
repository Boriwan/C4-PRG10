import java.util.Objects;

public class Coor {
    private final int x;
    private final int y;
    int houses;

    public Coor(int x, int y, int houses) {
        this.x = x;
        this.y = y;
        this.houses = houses;
    }

    @Override
    public boolean equals(Object o) {
    return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, houses);
    }
}
