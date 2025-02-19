package lv.projekts.dokdb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionCreater {

    private final SessionFactory sessionFactory;

    public SessionCreater() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Document.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public Session open() {
        return sessionFactory.openSession();
    }
}
