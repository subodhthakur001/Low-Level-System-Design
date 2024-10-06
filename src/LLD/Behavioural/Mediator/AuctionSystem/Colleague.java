package LLD.Behavioural.Mediator.AuctionSystem;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveBidNotification(int bidAmount);
    String getName();
}
