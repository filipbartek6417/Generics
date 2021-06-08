package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private final String name;
    private final ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if (teams.contains(team)){
            System.out.println("Already in the league!");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void showRankings(){
        Collections.sort(teams);
        int i = 1;
        for (Team<Player> t : teams){
            System.out.println(i + ". " + t.getName() + " has " + t.points());
            i++;
        }
    }

}
