package org.example;

public class RentEvent implements GameEvent {
    private final int rentAmount;

    public RentEvent(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public EventType getType() {
        return EventType.RENT;
    }

    @Override
    public void execute(Player player) {
        int totalRentAmount = (int) (player.getMoney() * 0.05) + rentAmount;
        player.decreaseMoney(totalRentAmount);
        System.out.println(player.getName() + " pays rent of " + totalRentAmount);
    }
}
