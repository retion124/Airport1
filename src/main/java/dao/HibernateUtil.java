package dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


    public class HibernateUtil {
        private static SessionFactory factory;

        static {
            try {
                factory = new Configuration()
                        .configure("Hibernete.cfg.xml")
                        .buildSessionFactory();
            } catch (HibernateException e) {
                e.printStackTrace();
            }
        }

        public static SessionFactory getSessionFactory() {
            return factory;
        }


    }
