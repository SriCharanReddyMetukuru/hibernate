package check;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Create {
    public static void main(String[] args)
    {
        try {
            SessionFactory sessionFactory
                = SessionFactoryProvider
                      .provideSessionFactory();
            
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();

            Student emp = new Student(124, "Rahul");
            session.persist(emp);
            t.commit();

            sessionFactory.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
