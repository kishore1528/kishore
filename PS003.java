class Bowler {
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    public void computeBowlingAverage() {
        if (validateInputs()) {
            if (wickets > 0) {
                double bowlingAvg = (double) runsConceded / wickets;
                System.out.println("Name: " + name);
                System.out.printf("bowling_avg=%.1f\n", bowlingAvg);
            } else {
                System.out.println("Error: Division by zero (no wickets).\n");
            }
        }
    }

    public void showStatistics() {
        if (validateInputs()) {
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + ballsBowled);
            System.out.println("runs_conceded=" + runsConceded);
            System.out.println("Name=" + name);
            System.out.println("wickets=" + wickets);
            System.out.println("matches=" + matches);
            System.out.println("balls_bowled=" + ballsBowled);
            System.out.println("runs_conceded=" + runsConceded);
        }
    }

    public void computeStrikeRate() {
        if (validateInputs()) {
            if (ballsBowled > 0) {
                double strikeRate = (double) runsConceded / ballsBowled;
                System.out.println("Name: " + name);
                System.out.printf("Strike_rate=%.8f\n", strikeRate);
            } else {
                System.out.println("Error: Division by zero (no balls bowled).\n");
            }
        }
    }

    private boolean validateInputs() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0) {
            System.out.println("Error");
            return false;
        }
        if (matches == 0 && (ballsBowled > 0 || runsConceded > 0)) {
            System.out.println("Error");
            return false;
        }
        return true;
    }
}

public class PS003 {
    public static void main(String[] args) {
        Bowler bowler = new Bowler("Sachin", 10, 5, 750, 463);
        bowler.showStatistics();
        bowler.computeBowlingAverage();
        bowler.computeStrikeRate();
    }
}