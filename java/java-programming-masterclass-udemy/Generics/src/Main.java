import com.sun.xml.internal.rngom.parse.host.Base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("does not work");   // it will cause an error
        items.add(4);
        items.add(5);

        printDoubled(items);
        System.out.println("---------------");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer ben = new BaseballPlayer("Ben");
        SockerPlayer tim = new SockerPlayer("Time");

        Team<FootballPlayer> slovanBA = new Team<>("Slovan Bratislava"); // proper assignment of a generic class
        slovanBA.addPlayer(joe);
//        slovanBA.addPlayer(ben);
//        slovanBA.addPlayer(tim);

        System.out.println(slovanBA.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Bulls");
        baseballTeam.addPlayer(ben);

        Team<SockerPlayer> brokenTeam = new Team<>("It will not work");
        brokenTeam.addPlayer(tim);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(slovanBA, 3, 8);

        slovanBA.matchResult(fremantle, 3, 1);
//        slovanBA.matchResult(baseballTeam, 4, 4);

        System.out.println("------------");
        System.out.println("Rankings");
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());
        System.out.println(slovanBA.getName() + " : " + slovanBA.ranking());
        System.out.println(hawthorn.getName() + " : " + hawthorn.ranking());

        System.out.println("compareTo");
        System.out.println(fremantle.compareTo(slovanBA));
        System.out.println(slovanBA.compareTo(hawthorn));

    }

    private static void printDoubled(ArrayList n) {
        for (Object i : n) { // TODO how to understand this notation?
            System.out.println((Integer) i * 2);
        }
    }

}

