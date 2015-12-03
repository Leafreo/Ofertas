package main;

public class EmailSubscribers implements Subscribers{

    String subsMail;

    public EmailSubscribers(String subsMail) {
        this.subsMail = subsMail;
    }

    public String getSubscriberMail() {
        return subsMail;
    }

    public void setSubscriberMail(String subsMail) {
        this.subsMail = subsMail;
    }

    public void update(String ofertaName) {

        System.out.println("New Deal '" + ofertaName + "' sent to " + subsMail);
    }
}

