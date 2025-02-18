package DesignPatterns.Behavioral.Observer;

public interface IStockExchange {

    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyObservers();
}