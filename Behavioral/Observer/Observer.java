package DesignPatterns.Behavioral.Observer;

public class Observer implements IObserver{
    StockExchange exchange;
    String userInfo;
    String updateMessage;

    public Observer(StockExchange exchange, String userInfo){
        this.exchange = exchange;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String desc) {
        this.updateMessage = desc;
        display(updateMessage);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing: " + userInfo);
        this.exchange.subscribe(this);
        System.out.println("Subscribed");
    }

    @Override
    public void unsubscribe() {
        System.out.println("Unsubscribing: " + userInfo);
        exchange.unsubscribe(this);
        System.out.println("Unsubscribed");
    }

    @Override
    public void display(String message) {
       System.out.println(message);
    }
    
}
