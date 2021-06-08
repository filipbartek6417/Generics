package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private final String name;
    int played = 0;
    int won = 0;
    int drawn = 0;
    int lost = 0;
    private final ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " added to the team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            won++;
        } else if (ourScore == theirScore){
            drawn++;
        } else {
            lost++;
        }
        played++;
        if (opponent != null){
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int points(){
        return (won * 3) + drawn;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.points() > team.points()){
            return -1;
        } else if (this.points() < team.points()){
            return 1;
        } else {
            return 0;
        }
    }
}
