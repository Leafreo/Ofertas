package main;

import java.util.ArrayList;

public class OfertasPublisher implements Publisher{

    private ArrayList<Subscribers> subs = new ArrayList<Subscribers>();
    private String ofertaName;
    private String ofertaDesc;
    String newOferta;


    public OfertasPublisher(String ofertaName, String ofertaDesc,String newOferta) {
        super();
        this.ofertaName = ofertaName;
        this.ofertaDesc = ofertaDesc;
        this.newOferta=newOferta;
    }

    public ArrayList<Subscribers> getSubscribers() {
        return subs;
    }
    public void setSubscribers(ArrayList<Subscribers> subs) {
        this.subs = subs;
    }
    public String getOfertaName() {
        return ofertaName;
    }
    public void setOfertaName(String ofertaName) {
        this.ofertaName = ofertaName;
    }
    public String getOfertaDesc() {
        return ofertaDesc;
    }
    public void setOfertaDesc(String ofertaDesc) {
        this.ofertaDesc = ofertaDesc;
    }

    public String getNewOferta() {
        return newOferta;
    }

    public void setNewOferta(String newOferta) {
        this.newOferta = newOferta;
        notifySubscribers();
    }

    public void notifySubscribers() {
        System.out.println("Sending an Email to all the subscribers when a new deal comes");
        for (Subscribers sm : subs) {
            sm.update(this.ofertaName );
        }

    }

    public void attachSubscriber(Subscribers sub) {
        subs.add(sub);

    }

    public void detachSubscriber(Subscribers sub) {
        subs.remove(sub);

    }

}


