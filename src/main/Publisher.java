package main;

public interface Publisher {
    public void attachSubscriber(Subscribers subscriber);
    public void detachSubscriber(Subscribers subscriber);
    public void notifySubscribers();
}

