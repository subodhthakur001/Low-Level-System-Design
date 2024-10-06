package LLD.Behavioural.Mediator.AuctionSystem;

public class Main {

    public static void main(String args[]){
        AuctionMediator auctionMediator = new Auction();

        Bidder bidder1 = new Bidder("A",auctionMediator);
        Bidder bidder2 = new Bidder("B",auctionMediator);

        bidder1.placeBid(2000);
        bidder2.placeBid(2500);
        bidder2.placeBid(2001);
    }
}
