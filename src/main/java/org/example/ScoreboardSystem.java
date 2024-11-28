package org.example;

import java.util.HashMap;
import java.util.Map;

public class ScoreboardSystem implements Observer {
    private final Map<String, Integer> scores = new HashMap<>();
    private final Map<String, Player> allPlayers = new HashMap<>();

    public void registerPlayer(Player player) {
        allPlayers.put(player.getName(), player);
        scores.put(player.getName(), player.getMoney());
    }

    @Override
    public void update(Player player) {
        scores.put(player.getName(), player.getMoney());
        displayScores();
    }

    private void displayScores() {
        System.out.println("===== Scoreboard =====");
        allPlayers.forEach((name, player) -> {
            int money = scores.getOrDefault(name, player.getMoney());
            System.out.println(name + ": $" + money);
        });
        System.out.println("======================");
    }
}


