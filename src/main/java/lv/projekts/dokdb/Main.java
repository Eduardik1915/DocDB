package lv.projekts.dokdb;

import lv.projekts.dokdb.javaFx.JavaFxLayout;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        JavaFxLayout.startFX();
      /*  SessionCreater sessionCreater = new SessionCreater();
        EntityManager session = sessionCreater.open();
        try (session) {
            // ///////////////////////////
            session.getTransaction().begin();
            Document document = new Document("New doc");
            session.persist(document);
            session.getTransaction().commit();
            // /////////////////////////
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
        }*/
    }

    public static void printState(Session session) {
        System.out.println("-".repeat(100));
        System.out.printf("Session: %s%n" +
                        "Dirty: %s%n" +
                        "Stat: %s%n",
                session, session.isDirty(), session.getStatistics());
        System.out.println("-".repeat(100));
    }
}

