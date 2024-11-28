package org.example;

public class TaxEvent implements GameEvent {
    private final int taxAmount;

    public TaxEvent(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    @Override
    public EventType getType() {
        return EventType.TAX;
    }

    @Override
    public void execute(Player player) {
        player.decreaseMoney(taxAmount);
        System.out.println(player.getName() + " pays tax of " + taxAmount);
    }
}
