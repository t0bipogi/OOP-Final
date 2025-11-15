import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private String role;
    private List<Hero> counters;

    public Hero(String name, String role) {
        this.name = name;
        this.role = role;
        this.counters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public List<Hero> getCounters() {
        return counters;
    }

    public void addCounters(Hero counterHero) {
        if (counterHero != null) {
            this.counters.add(counterHero);
        }
    }
}