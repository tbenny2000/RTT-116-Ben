package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Collections;
import java.util.List;

public class EmployeeDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void updateEmployee (Employee employee) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void createEmployee (Employee employee) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteEmployeeByProduct (Employee employee) {
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

    public void deleteEmployeeById (int Id) {
        Session session = factory.openSession();
        session.beginTransaction();
        Employee empployee = (Employee) session.get(Employee.class, Id);
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

    public Employee findEmployeeById (int employeeId) {
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

    public List<Employee> findByFirstName(String firstName) {
        String hql = "SELECT emp FROM Employee emp WHERE emp.firstName = :firstName";
        Session session = factory.openSession();

        TypedQuery<Employee> query = session.createQuery(hql, Employee.class);
        query.setParameter("firstName", firstName);

        try {
            return query.getResultList(); // Use getResultList() to fetch multiple results
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList(); // Return an empty list in case of an error
        } finally {
            session.close();
        }
    }



    public static void main () {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        Employee e = employeeDAO.findEmployeeById(1501);
        System.out.println(e);
    }
}
