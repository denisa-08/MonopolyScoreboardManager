package org.example;

public class GameEventFactory {
    public static GameEvent createEvent(EventType type, int amount) {
        return switch (type) {
            case TAX -> new TaxEvent(amount);
            case RENT -> new RentEvent(amount);
            case REWARD -> new RewardEvent(amount);
        };
    }
}

