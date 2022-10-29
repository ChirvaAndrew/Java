public class Team {
    private int score;
    private String name;

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void click() {
        score ++;

    }

}
