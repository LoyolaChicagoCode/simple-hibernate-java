import hb.Keyword;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class Main {

	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration().configure();
		cfg.setProperty(Environment.HBM2DDL_AUTO, "create");

		SessionFactory sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();

		Transaction tx = null;
		Keyword kw = new Keyword(1, "red");
		try {
			tx = session.beginTransaction();
			session.save(kw);
			tx.commit();
		} catch (HibernateException he) {
			if (tx != null)
				tx.rollback();
			throw he;
		} finally {
			session.close();
		}
	}
}