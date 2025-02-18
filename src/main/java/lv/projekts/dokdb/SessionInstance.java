package lv.projekts.dokdb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionInstance implements AutoCloseable{

    private final SessionFactory sessionFactory;

    public SessionInstance() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Document.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public Session open() {
        return sessionFactory.openSession();
    }

    @Override
    public void close() throws Exception {
        sessionFactory.close();
    }
}
