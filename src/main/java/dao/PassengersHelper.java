package dao;

import Enteti.Passengers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import java.util.List;

public class PassengersHelper  {
    private SessionFactory sessionFactory;

    public PassengersHelper() {sessionFactory = HibernateUtil.getSessionFactory();}

    public List<Passengers> getPassengersList(){

        Session session = sessionFactory.openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery cq = cb.createQuery(Passengers.class);

        Root<Passengers> root = cq.from(Passengers.class);

        Selection[] selections = {root.get("PassengersId")};

        cq.select(cb.construct(Passengers.class, selections));

        Query query = session.createQuery(cq);

        List<Passengers> passengersList = query.getResultList();

        session.close();

        return passengersList;
    }

    public Passengers getPassengersById(int id) {
        Session session = sessionFactory.openSession();
        Passengers passengers = session.get(Passengers.class, id);
        session.close();
        return passengers;
    }

    public Passengers addPassengers(Passengers passengers){

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(passengers);

        session.getTransaction().commit();

        session.close();

        return passengers;

    }

}


