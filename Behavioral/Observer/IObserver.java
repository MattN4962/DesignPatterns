package DesignPatterns.Behavioral.Observer;

public interface IObserver {
    public void update(String desc);
    public void subscribe();
    public void unsubscribe();
    public void display(String message);
}
