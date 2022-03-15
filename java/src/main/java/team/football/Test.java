package team.football;


public class Test {
    public static void main(String[] args) {

        Team barcelona = new Team("Barcelona");
        Stats messiStats = new Stats(75, 85, 84,92,67);
        Player messi = new Player("Messi", messiStats);

        Stats piqueStats = new Stats(95,82,82,89,68);
        Player pique = new Player("Girard_Pique", piqueStats);

        System.out.println(barcelona.getRating());
        barcelona.addPlayer(messi);
        barcelona.addPlayer(pique);
        System.out.println(barcelona.getRating());
        barcelona.deletePlayer(pique);
        System.out.println(barcelona.getRating());

    }
}

