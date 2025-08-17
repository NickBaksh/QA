package practice_3;

public class GameSettings {
    static int maxPlayers = 10;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        };
    }

    void printGameStatus() {
        System.out.println(gameName);
        System.out.println(currentPlayers);
        System.out.println(GameSettings.maxPlayers);
    }
}
