package org.example;

public class RewardEvent implements GameEvent {
    private final int rewardAmount;

    public RewardEvent(int rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    @Override
    public EventType getType() {
        return EventType.REWARD;
    }

    @Override
    public void execute(Player player) {
        player.increaseMoney(rewardAmount);
        System.out.println(player.getName() + " receives reward of " + rewardAmount);
    }
}
