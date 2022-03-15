package team.football;

import java.util.LinkedList;

public class Team {
    private String name;
    private int rating;
    private LinkedList<Player> playerList = new LinkedList<>();

    public Team(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals(null)){
            this.name = name;
        }else{
            System.out.println("A name should not be empty!");
        }
    }

    public void addPlayer(Player player) {
        playerList.add(player);
        calculateRating();
    }

    public void deletePlayer(Player player) {
        if (playerList.contains(player)) {
            playerList.remove(player);
            calculateRating();
        }else {
            System.out.println("Player " + player.getName() + " is not in " + name + " team.");
        }
    }

    public int getRating() {
        return rating;
    }

    public void calculateRating() {
        int result = 0;
        for (Player player : playerList) {
            result += player.getOverallSkills();
        }
        rating = result / playerList.size();
    }
}
