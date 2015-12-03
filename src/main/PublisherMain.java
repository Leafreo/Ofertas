package main;


 public class PublisherMain {

     public static void main(String[] args) {
     EmailSubscribers betoMail=new EmailSubscribers("beto@hotmail.com");
     EmailSubscribers emiMail=new EmailSubscribers("emilio@gmail.com");
     EmailSubscribers crissMail=new EmailSubscribers("criss@yahoo.com");

        OfertasPublisher Electronicos=new OfertasPublisher("Wii U", "Console 30% off", "0");
        OfertasPublisher Ropa=new OfertasPublisher("Shirt", "2x1", "0");
        OfertasPublisher Deportivo=new OfertasPublisher("SoccerBall", "Sale", "0");

        Electronicos.attachSubscriber(betoMail);
        Deportivo.attachSubscriber(betoMail);

        Ropa.attachSubscriber(emiMail);
        Deportivo.attachSubscriber(emiMail);
         
        Electronicos.attachSubscriber(crissMail);
        Ropa.attachSubscriber(crissMail);

        Electronicos.setNewOferta("1");
        Ropa.setNewOferta("1");
        Deportivo.setNewOferta("1");

     }
 }
