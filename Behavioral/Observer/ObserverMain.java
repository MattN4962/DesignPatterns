package DesignPatterns.Behavioral.Observer;

import java.util.ArrayList;

import javax.management.Descriptor;

public class ObserverMain{

    public static void main(String[] args) {
        StockExchange exchange = new StockExchange(new ArrayList<Observer>());
        Observer observer = new Observer(exchange, "someEmail@gmail.com");
        observer.subscribe();

        Observer observer2 = new Observer(exchange, "someotheremail@gmail.com");
        observer.subscribe();

        ICommentary comObject = ((ICommentary) exchange)
        comObject.setTickerMessage("Appl", 20, '+');
        comObject.setTickerMessage("GOOG", 15, '-');
    }
}

