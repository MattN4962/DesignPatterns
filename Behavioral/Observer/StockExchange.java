package DesignPatterns.Behavioral.Observer;

import java.util.List;

public class StockExchange implements IStockExchange, IDescriptor{
    List<Observer> _observers;
    String tickerName;
    int tickerPrice;
    String tickerMessage;

    public StockExchange(List<Observer> observers, String tickerName, int tickerPrice, String tickerMessage){
        this._observers = observers;
        this.tickerPrice = tickerPrice;
        this.tickerName = tickerName;
        this.tickerMessage = tickerMessage;
    }

    @Override
    public void setTickerMessage(String tickerName, int tickerPrice, char changeIndicator) {
       if(changeIndicator == '+'){
        tickerMessage = tickerName + " is up to" + tickerPrice + ".";
       } else {
        tickerMessage = tickerName + " is down to" + tickerPrice + ".";
       }
       notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        try{
            if(_observers != null){
                _observers.add(observer);
            } else {
                throw new NullPointerException("List has not been initialized");
            }
        } catch(IllegalArgumentException e){
            System.out.println("Bad Type");
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public void unsubscribe(Observer observer) {
        int index = _observers.indexOf(observer);
        try{
            _observers.remove(index);
        } catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index or item is not present");
        }
    }

    @Override
    public void notifyObservers() {
        _observers.stream().forEach(observer -> observer.update(tickerMessage));
    }

    

}
