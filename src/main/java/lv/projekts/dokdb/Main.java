package lv.projekts.dokdb;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        try (SessionInstance sessionInstance = new SessionInstance();) {
            Session session = sessionInstance.open();
            session.beginTransaction();
            // System.out.println(session.find(Document.class, 1));
            JavaFxLayout.startFX();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

