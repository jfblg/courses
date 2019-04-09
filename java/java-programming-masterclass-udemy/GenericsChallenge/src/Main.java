public class Main {
    public static void main(String[] args) {
        /**
         * ArrayList<Team> teams;
         * Collection.sort(teams);
         * Create a generic class to implement a league table for a sport
         * The class should allow team to be added to the list, and store
         * a list of teams that belong to the list
         *
         * Your class should have a method to print out the teams in the order,
         * with the team at the top of the league printed first
         *
         * Only teams of the same class should be added to any particular
         * instance of the league class - the program should fail to compile
         * if an attempt is made to add an incompatible class
         */

        FootballTeam manchester = new FootballTeam("Manchester United");
        FootballTeam chaleey = new FootballTeam("Chalsey UK");
        FootballTeam trnava = new FootballTeam("Spartak Trnava");

        CyclingTeam bora = new CyclingTeam("Bora Sangrohe");
        CyclingTeam sky = new CyclingTeam("SKY Cycling");

        League<Team<FootballTeam>> footballLeague = new League<>("AFL");


    }
}

