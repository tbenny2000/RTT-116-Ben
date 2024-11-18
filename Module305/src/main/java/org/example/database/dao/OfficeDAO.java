package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.example.database.entity.Office;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class OfficeDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void createCustomer(Office office) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.persist(office);
        session.getTransaction().commit();
    }

    public void deleteOffice(Office office) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.detach(office);
        session.getTransaction().commit();
    }

    public void updateOffice(Office office) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(office);
        session.getTransaction().commit();
    }

    public Office findOfficeById(Integer id){

        String sql = "SELECT * FROM office WHERE id = ?";
        Session session = factory.openSession();

        String hqlQuery = "SELECT o FROM Office O WHERE o.id = :officeId";        //Hibernate Query Language

        TypedQuery<Office> query = session.createQuery(hqlQuery, Office.class);
        query.setParameter("officeId", id);

        try {
            Office result = query.getSingleResult();
            return result;
        }catch (Exception e) {
            return null;

        }finally {
            session.close();
        }
    }

    public List<Office> findOfficeWithName(String name) {
        Session session = factory.openSession();

        String hqlName = "SELECT o FROM Office o WHERE o.city = :oCity " +
                "                                   OR o.phone = :oPhone" +
                "                                   OR o.country = :oCountry" +
                "                                   ORDER BY o.city";

        TypedQuery<Office> query = session.createQuery(hqlName, Office.class);
        query.setParameter("oCity", name);

        try{
            List<Office> resultNameList = query.getResultList();
            return resultNameList;
        }catch(Exception e) {
            return new ArrayList<>();

        }finally {
            session.close();
        }
    }
}
