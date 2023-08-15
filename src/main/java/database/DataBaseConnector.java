package database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DataBaseConnector {

    public static void executeUpdate(List<String> commands){
        SessionFactory sessionFactory =
                new Configuration()
                        .configure("hibernate.cfg.xml")
                        .buildSessionFactory();

        try(Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            commands.forEach(command -> session.createNativeQuery(command).executeUpdate());
            transaction.commit();
            session.close();
        }
    }

}
