import java.util.Scanner;

public class DotaMatchupHelper {
    private CounterSystem counterSystem;

    public DotaMatchupHelper() {
        this.counterSystem = new CounterSystem();
    }

    private void initializeHeroes() {
        Hero juggernaut = new Hero("Juggernaut", "Carry");
        Hero ursa = new Hero("Ursa", "Carry");
        Hero axe = new Hero("Axe", "Offlane");
        Hero venomancer = new Hero("Venomancer", "Support");
        Hero earthshaker = new Hero("Earthshaker", "Mid/Offlane/Support");
        Hero leshrac = new Hero("Leshrac", "Mid");
        Hero disruptor = new Hero("Disruptor", "Support");
        Hero dawnbreaker = new Hero("Dawnbreaker", "Offlane");
        Hero queenofPain = new Hero("Queen of Pain", "Mid");
        Hero legionCommander = new Hero("Legion Commander", "Offlane");
        Hero naturesProphet = new Hero("Nature's Prophet", "Carry/Mid/Support");
        Hero sven = new Hero("Sven", "Carry");
        Hero snapfire = new Hero("Snapfire", "Support");
        Hero templarAssassin = new Hero("Templar Assassin", "Carry/Mid");
        Hero pugna = new Hero("Pugna", "Support");
        Hero mars = new Hero("Mars", "Offlane");
        Hero drowRanger = new Hero("Drow Ranger", "Carry");
        Hero puck = new Hero("Puck", "Mid");
        Hero silencer = new Hero("Silencer", "Support");
        Hero winterWyvern = new Hero("Winter Wyvern", "Support");
        Hero phantomLancer = new Hero("Phantom Lancer", "Carry");
        Hero sniper = new Hero("Sniper", "Carry/Mid");
        Hero abaddon = new Hero("Abaddon", "Offlane/Support");
        Hero bane = new Hero("Bane", "Support");
        Hero hoodwink = new Hero("Hoodwink", "Support");
        Hero lifestealer = new Hero("Lifestealer", "Carry");
        Hero antiMage = new Hero("Anti-Mage", "Carry");
        Hero spectre = new Hero("Spectre", "Carry");
        Hero zeus = new Hero("Zeus", "Mid/Support");
        Hero slardar = new Hero("Slardar", "Offlane");
        Hero shadowDemon = new Hero("Shadow Demon", "Support");
        Hero dazzle = new Hero("Dazzle", "Support");
        Hero trollWarlord = new Hero("Troll Warlord", "Carry");
        Hero deathProphet = new Hero("Death Prophet", "Offlane/Mid");



        counterSystem.addHero(juggernaut);
        counterSystem.addHero(ursa);
        counterSystem.addHero(axe);
        counterSystem.addHero(venomancer);
        counterSystem.addHero(disruptor);
        counterSystem.addHero(templarAssassin);
        counterSystem.addHero(legionCommander);
        counterSystem.addHero(sven);
        counterSystem.addHero(naturesProphet);
        counterSystem.addHero(snapfire);
        counterSystem.addHero(queenofPain);
        counterSystem.addHero(dawnbreaker);
        counterSystem.addHero(leshrac);
        counterSystem.addHero(earthshaker);



        
        juggernaut.addCounters(pugna);
        juggernaut.addCounters(mars);
        juggernaut.addCounters(bane);
        
        ursa.addCounters(pugna);
        ursa.addCounters(phantomLancer);
        ursa.addCounters(disruptor);

        axe.addCounters(ursa);
        axe.addCounters(pugna);
        axe.addCounters(hoodwink);
        
        venomancer.addCounters(drowRanger);
        venomancer.addCounters(sniper);
        venomancer.addCounters(abaddon);
        
        disruptor.addCounters(lifestealer);
        disruptor.addCounters(juggernaut);
        disruptor.addCounters(antiMage);

        templarAssassin.addCounters(zeus);
        templarAssassin.addCounters(axe);
        templarAssassin.addCounters(slardar);

        legionCommander.addCounters(pugna);
        legionCommander.addCounters(dazzle);
        legionCommander.addCounters(shadowDemon);

        sven.addCounters(trollWarlord);
        sven.addCounters(pugna);
        sven.addCounters(winterWyvern);
    
        naturesProphet.addCounters(spectre);
        naturesProphet.addCounters(disruptor);

        queenofPain.addCounters(puck);
        queenofPain.addCounters(silencer);
        queenofPain.addCounters(deathProphet);

        dawnbreaker.addCounters(silencer);
        dawnbreaker.addCounters(disruptor);

        leshrac.addCounters(antiMage);
        leshrac.addCounters(pugna);
        leshrac.addCounters(drowRanger);

        earthshaker.addCounters(silencer);
        earthshaker.addCounters(abaddon);
        earthshaker.addCounters(venomancer);


    }
    
 private void start() {
    Scanner scanner = new Scanner(System.in);
    String input;

    System.out.println("\n==============================================");
    System.out.println("          DOTA HERO MATCHUP HELPER            ");
    System.out.println("==============================================");

    counterSystem.showAvailableHeroes();

    do {
        System.out.println("\nEnter hero number to counter (or type '0' to EXIT):");
        System.out.print("> ");

        input = scanner.nextLine().trim();

        if (input.equals("0")) {
            break;
        }

        try {
            int heroNumber = Integer.parseInt(input);
            Hero selectedHero = counterSystem.getHeroByIndex(heroNumber);

            if (selectedHero == null) {
                System.out.println("[ERROR] Invalid hero number. Try again.");
            } else {
                counterSystem.suggestCounters(selectedHero.getName());
            }
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] Please enter a valid number.");
        }

    } while (true);

    System.out.println("\nQuitting program. Goodbye!");
    scanner.close();
}


    public static void main(String[] args) {
        DotaMatchupHelper app = new DotaMatchupHelper();
        app.initializeHeroes();
        app.start();
    }
}