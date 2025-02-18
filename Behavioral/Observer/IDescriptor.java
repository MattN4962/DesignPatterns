package DesignPatters.Behavioral.Observer;

public interface IDescriptor {
    public void setTickerMessage(String tickerName, int tickerPrice, char changeIndicator);
}
