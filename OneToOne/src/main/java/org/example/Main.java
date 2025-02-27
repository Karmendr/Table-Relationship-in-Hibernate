package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure("config.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        Department department = new Department();

        department.setName("Perches");

        employee.setName("Rajesh");
        employee.setAge(21);
        employee.setSalary(21000);
        employee.setDepartment(department);
        session.save(employee);
        session.save(department);
        transaction.commit();
        session.close();
        System.out.println("Record Inserted!.....");

    }
}
