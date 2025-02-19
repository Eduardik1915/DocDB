package lv.projekts.dokdb;

import org.hibernate.Session;

public class DocumentHandling {
    private final SessionCreater sessionCreater;

    public DocumentHandling(SessionCreater sessionCreater) {
        this.sessionCreater = sessionCreater;
    }

    public void create(Document document) {
        try (Session session = sessionCreater.open();) {
            session.beginTransaction();
            try {
                session.merge(document);
                session.getTransaction().commit();
            } catch (RuntimeException e){
                session.getTransaction().rollback();
                throw e;
            }
        }
    }
}
