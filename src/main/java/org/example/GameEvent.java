package org.example;

public interface GameEvent {
    EventType getType();
    void execute(Player player);
}
