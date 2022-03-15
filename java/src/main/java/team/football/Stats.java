package team.football;

public class Stats {
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Stats(int endurance, int sprint, int dribble, int passing, int shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }
    public void setEndurance(int endurance) {
        if (endurance>=0 && endurance<=100){
            this.endurance = endurance;}
        else {
            System.out.println("Endurance should be between 0 and 100.");
        }
    }

    public void setSprint(int sprint) {
        if (sprint>=0 && sprint<=100){
            this.sprint = sprint;}
        else {
            System.out.println("Sprint should be between 0 and 100.");
        }
    }

    public void setDribble(int dribble) {
        if (dribble>=0 && dribble<=100){
            this.dribble = dribble;}
        else {
            System.out.println("Dribble should be between 0 and 100.");
        }
    }

    public void setPassing(int passing) {
        if (passing>=0 && passing<=100){
            this.passing = passing;}
        else {
            System.out.println("Passing should be between 0 and 100.");
        }
    }

    public void setShooting(int shooting) {
        if (shooting>=0 && shooting<=100){
            this.shooting = shooting;}
        else {
            System.out.println("Shooting should be between 0 and 100.");
        }
    }

    public int statsLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5;
    }
}
