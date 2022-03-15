package team.football;

public class Player{
    private String name;
    private Stats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("A name should not be empty!");
        }
    }

    public void setStats(Stats stats) {
        if (!stats.equals(null)){
            this.stats = stats;
        }else {
            System.out.println("Null value for statistics!");
        }
    }

    private Stats getStats(){
        return stats;
    }

    public Player(String name, Stats stats){
        setName(name);
        setStats(stats);
    }

    public int getOverallSkills(){
        return stats.statsLevel();
    }
}
