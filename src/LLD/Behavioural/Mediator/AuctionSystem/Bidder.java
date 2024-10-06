package LLD.Behavioural.Mediator.AuctionSystem;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBider(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder : " + name + "got the notification that someone has bid of : " + bidAmount);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
