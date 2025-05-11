// Base class
class Game {
    protected String playerName;
    protected int score;

    // Constructor
    public Game(String name) {
        this.playerName = name;
        this.score = 0;
    }

    // Basic actions
    public void attack() {
        System.out.println(playerName + " attacks the enemy!");
        score += 10;
    }

    public void defend() {
        System.out.println(playerName + " defends the attack!");
        score += 5;
    }

    public void heal() {
        System.out.println(playerName + " heals and regains energy!");
        score += 7;
    }

    public void showScore() {
        System.out.println(playerName + "'s current score: " + score);
    }
}

// Derived class (inherits from Game)
class AdventureGame extends Game {
    private int level;

    // Constructor for derived class
    public AdventureGame(String name) {
        super(name);
        this.level = 1;
    }

    // Special move only in AdventureGame
    public void specialMove() {
        System.out.println(playerName + " uses a powerful special move!");
        score += 20;
        levelUp();
    }

    private void levelUp() {
        level++;
        System.out.println(playerName + " has reached level " + level + "!");
    }

    public void showStatus() {
        showScore();
        System.out.println("Level: " + level);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        AdventureGame player = new AdventureGame("Aman");

        // Simulate actions
        player.attack();
        player.defend();
        player.heal();
        player.specialMove();

        // Show final status
        player.showStatus();
    }
}
