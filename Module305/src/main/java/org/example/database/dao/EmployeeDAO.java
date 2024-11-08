package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void update (Employee employee) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void create (Employee employee) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteByProduct (Employee employee) {
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.persist(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public void deleteById (int Id) {
        Session session = factory.openSession();
        session.beginTransaction();
        Employee emp = (Employee) session.get(Employee.class, Id);
        try {
            session.persist(Id);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public Employee findById (int employeeId) {
        String hql = "SELECT emp FROM Employee emp WHERE id = :employeeId";
        Session session = factory.openSession();

        TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("employeeId", employeeId);

        try {
            Employee employee = query.getSingleResult();
            return employee;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }



    public static void main () {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        Employee e = employeeDAO.findById(1501);
        System.out.println(e);
    }
}
