package com.company;

// import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer phil = new FootballPlayer("Phil");
        FootballPlayer adam = new FootballPlayer("Adam");
        BasketballPlayer pete = new BasketballPlayer("Pete");
        HockeyPlayer jake = new HockeyPlayer("Jake");
        Team<FootballPlayer> laRangers = new Team<>("LA Rangers");
        laRangers.addPlayer(phil);
        laRangers.addPlayer(adam);
//        laRangers.addPlayer(jake);
        laRangers.addPlayer(phil);
        System.out.println(laRangers.numPlayers());

        Team<BasketballPlayer> chicBulls = new Team<>("Chicago Bulls");
        chicBulls.addPlayer(pete);

        Team<FootballPlayer> ruzhnev = new Team<>("Ruzhnev Presporok");

        laRangers.matchResult(ruzhnev, 4, 2);
        System.out.println(laRangers.points());
        System.out.println(ruzhnev.points());

        System.out.println(laRangers.compareTo(ruzhnev));
        System.out.println(ruzhnev.compareTo(laRangers));

        LeagueTable<Team<FootballPlayer>> premierLeague = new LeagueTable<>("Premier League");
        premierLeague.addTeam(laRangers);
        premierLeague.addTeam(ruzhnev);
        premierLeague.showRankings();
//        premierLeague.addTeam(chicBulls);
        premierLeague.showRankings();

//        Team<String> brokenTeam = new Team<>("broken");
//        brokenTeam.addPlayer("Broke Jack");


//         ArrayList<Integer> items = new ArrayList<>();
//         items.add(1);
//         items.add(2);
//         items.add(3);
// //        items.add("Filip");
//         items.add(4);
//         items.add(5);
//
//         printDoubled(items);
    }

/*
    private static void printDoubled(ArrayList<Integer> items){
        for (int i : items){
            System.out.println(i * 2);
        }
    }
*/
}
