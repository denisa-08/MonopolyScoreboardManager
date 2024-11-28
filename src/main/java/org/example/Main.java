package org.example;

public class Main {
    public static void main(String[] args) {
        GameEventManager eventManager = new GameEventManager();

        ScoreboardSystem scoreboardSystem = new ScoreboardSystem();
        eventManager.addObserver(scoreboardSystem);

        Player player1 = new Player("Alice", 1500);
        Player player2 = new Player("Bob", 1500);

        scoreboardSystem.registerPlayer(player1);
        scoreboardSystem.registerPlayer(player2);

        GameEvent taxEvent = GameEventFactory.createEvent(EventType.TAX, 200);
        GameEvent rentEvent = GameEventFactory.createEvent(EventType.RENT, 100);
        GameEvent rewardEvent = GameEventFactory.createEvent(EventType.REWARD, 300);

        taxEvent.execute(player1);
        eventManager.notifyObservers(player1);

        rentEvent.execute(player2);
        eventManager.notifyObservers(player2);

        rewardEvent.execute(player1);
        eventManager.notifyObservers(player1);
    }
}
