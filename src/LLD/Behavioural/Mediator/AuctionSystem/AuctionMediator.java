package LLD.Behavioural.Mediator.AuctionSystem;

public interface AuctionMediator{
     void addBider(Colleague bidder);
     void placeBid(Colleague bidder, int bidAmount);
}
