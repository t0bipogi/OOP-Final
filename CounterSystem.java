import java.util.ArrayList;
import java.util.List;

public class CounterSystem {
    private ArrayList<Hero> heroes; 

    public CounterSystem() {
        this.heroes = new ArrayList<>();
    }

    public void addHero(Hero hero) {
        if (hero != null) {
            this.heroes.add(hero);
        }
    }

    public Hero findHero(String name) {
        for (Hero hero : this.heroes) {
            if (hero.getName().equalsIgnoreCase(name.trim())) {
                return hero;
            }
        }
        return null; // Not found
    }

   public void showAvailableHeroes() {
    System.out.println("\n--- Available Meta Hero Pool (" + heroes.size() + " Heroes) ---");
    
    int index = 1;
    for (Hero hero : this.heroes) {
        System.out.println(" " + index + "- " + hero.getName() + " [" + hero.getRole() + "]");
        index++;
    }


    
    System.out.println("----------------------------------------------");
}

public Hero getHeroByIndex(int index) {
    if (index < 1 || index > heroes.size()) {
        return null;
    }
    return heroes.get(index - 1);
}

    public void suggestCounters(String name) {
        Hero targetHero = findHero(name);

        if (targetHero == null) {
            System.out.println("\n[ERROR] Hero '" + name + "' is not in the current meta pool.");
            System.out.println("Please type a name from the list above.");
            return;
        }

        List<Hero> counters = targetHero.getCounters();

        System.out.println("\n--- Counter Suggestions for: " + targetHero.getName() + " ---");
        if (counters.isEmpty()) {
            System.out.println("No specific counter suggestions available in this pool.");
        } else {
            for (Hero counter : counters) {
                System.out.println(" • " + counter.getName() + " (Role: " + counter.getRole() + ")");
            }
        }
        System.out.println("-----------------------------------------------------");
    }
}